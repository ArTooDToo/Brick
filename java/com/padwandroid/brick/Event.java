package com.padwandroid.brick;

import android.content.res.Resources;
import android.widget.ImageView;
import java.util.Calendar;

class Event {
    private Calendar c = Calendar.getInstance();
    private int day;
    public int[] iMages = {R.drawable.brick_man, R.drawable.ball,R.drawable.crack,
            R.drawable.ivy, R.drawable.jack_waller, R.drawable.kielbasello,R.drawable.tell_others,
            R.drawable.meowall, R.drawable.constru, R.drawable.day_night, R.drawable.hey,
            R.drawable.przekroj, R.drawable.smieszkuj_dzis, R.drawable.sq, R.drawable.serce,
            R.drawable.steak_check, R.drawable.tornado, R.drawable.robot, R.drawable.zejak,
            R.drawable.wulkan, R.drawable.zarowka, R.drawable.znak_drogowy, R.drawable.szklanka,
            R.drawable.future, R.drawable.ksiazka, R.drawable.night_wall, R.drawable.pateto,
            R.drawable.peace,R.drawable.luty_29, R.drawable.strach_przed_nieznanym, R.drawable.wasidlo };

    public void getBack(ImageView Iv) {
        day = c.get(Calendar.DAY_OF_MONTH);
        Iv.setImageResource(iMages[day-1]);
    }

}
