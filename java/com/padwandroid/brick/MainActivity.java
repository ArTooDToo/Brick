package com.padwandroid.brick;



import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tx1, tx2;
    private RelativeLayout tlo1;
    private ImageView Iv;
    private ToggleButton tg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tlo1 = (RelativeLayout)findViewById(R.id.tlo);
        tx1 = (TextView)findViewById(R.id.textView);
        tx2 = (TextView)findViewById(R.id.textView_des);
        Iv = (ImageView)findViewById(R.id.cegielka);
        tg = (ToggleButton)findViewById(R.id.toggleButton);

        Resources res = getResources();
        Calendar c = Calendar.getInstance();
        final int day = c.get(Calendar.DAY_OF_MONTH);
        final String[] ma = res.getStringArray(R.array.day_description);
        tg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Event a = new Event();
                if (isChecked == true) {
                        a.getBack(Iv);
                        tx2.setText(ma[day-1]);
                    }
                else{
                    tx2.setText("");
                    Iv.setImageResource(0);
                }
            }

        });

        upTime();
//Kliknięcie
        Iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shortBrickClick();
            }
        });
//Długie przytrzymanie
        Iv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(true){
                    longClickBrick();
                }
                return false;
            }
        });
    }

// Zapis i odczyt stanu podczas obrotu ekranu
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("savText", tx1.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        tx1.setText(savedInstanceState.getString("savText"));

    }

//Długie przytrzymanie na cegle, powoduje wyświetlenie ranodomowego Toastu
    public void longClickBrick(){
        Random r = new Random();
        int i1 = r.nextInt(5);
        Resources res = getResources();
        String[]mala = res.getStringArray(R.array.toasty_array);
        Toast toast = new Toast(getApplicationContext());
        toast.makeText(getApplicationContext(), mala[i1] , Toast.LENGTH_SHORT).show();

    }
//Kliknięcie powoduje wyświetlenie randomowego napisu
     public void shortBrickClick(){
         Random r = new Random();
         int i1 = r.nextInt(71);
         Resources res = getResources();
         String[]title = res.getStringArray(R.array.title);
         tx1.setText(title[i1]);

    }

    // Ustawia kolor tła, zależenie od godziny
    public void upTime(){
        Calendar c = Calendar.getInstance();
        int hr = c.get(Calendar.HOUR_OF_DAY);
        if(hr >= 20 || hr <6){
            tlo1.setBackgroundColor(getResources().getColor(R.color.colorMidnightBlue));
        }else{
            tlo1.setBackgroundColor(getResources().getColor(R.color.pastel_green));
        }

    }
}
