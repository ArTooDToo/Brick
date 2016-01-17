package com.padwandroid.brick;

import android.widget.ImageView;
import java.util.Calendar;

class Event {
    private Calendar c = Calendar.getInstance();
    private int day;

    public void getBack(ImageView Iv){
        day = c.get(Calendar.DAY_OF_MONTH);
        switch (day){
//            1 stycznia to dzień 0
            case 1:
                brick_man(Iv);
                break;
            case 2:
                ball(Iv);
                break;
            case 3:
                crack(Iv);
                break;
            case 4:
                ivy(Iv);
                break;
            case 5:
                jack(Iv);
                break;
            case 6:
                kielba(Iv);
                break;
            case 7:
                tell(Iv);
                break;
            case 8:
                meow(Iv);
                break;
            case 9:
                constr(Iv);
                break;
            case 10:
                day_night(Iv);
                break;
            case 11:
                hey(Iv);
                break;
            case 12:
                przekroj(Iv);
                break;
            case 13:
                smieszek(Iv);
                break;
            case 14:
                wal(Iv);
                break;
            case 15:
                squi(Iv);
                break;
            case 16:
                steak(Iv);
                break;
            case 17:
                tornado(Iv);
                break;
            case 18:
                robot(Iv);
                break;
            case 19:
                zejak(Iv);
                break;
            case 20:
                wulkan(Iv);
                break;
            case 21:
                zarowka(Iv);
                break;
            case 22:
                znak(Iv);
                break;
            case 23:
                szklanka(Iv);
                break;
            case 24:
                future(Iv);
                break;
            case 25:
                ksiazka(Iv);
                break;
            case 26:
                nightWall(Iv);
                break;
            case 27:
                potato(Iv);
                break;
            case 28:
                peace(Iv);
                break;
            case 29:
                day_29(Iv);
                break;
            case 30:
                strach(Iv);
                break;
            case 31:
                wasidlo(Iv);
                break;
        }

    }
    private void brick_man(ImageView Iv){
        Iv.setImageResource(R.drawable.brick_man);
    }
    private void ball(ImageView Iv){
        Iv.setImageResource(R.drawable.ball);
    }
    private void crack(ImageView Iv){
        Iv.setImageResource(R.drawable.crack);
    }
    private void ivy(ImageView Iv){
        Iv.setImageResource(R.drawable.ivy);
    }
    private void jack(ImageView Iv){
        Iv.setImageResource(R.drawable.jack_waller);
    }
    private void kielba(ImageView Iv){
        Iv.setImageResource(R.drawable.kielbasello);
    }
    private void tell(ImageView Iv){
        Iv.setImageResource(R.drawable.tell_others);
    }
    private void meow(ImageView Iv){
        Iv.setImageResource(R.drawable.meowall);
    }
    private void constr(ImageView Iv){
        Iv.setImageResource(R.drawable.constru);
    }
    private void day_night(ImageView Iv){
        Iv.setImageResource(R.drawable.day_night);
    }
    private void hey(ImageView Iv){
        Iv.setImageResource(R.drawable.hey);
    }
    private void przekroj(ImageView Iv){
        Iv.setImageResource(R.drawable.przekroj);
    }
    private void smieszek(ImageView Iv){
        Iv.setImageResource(R.drawable.smieszkuj_dzis);
    }
    private void squi(ImageView Iv){
        Iv.setImageResource(R.drawable.sq);
    }
    private void wal(ImageView Iv){
        Iv.setImageResource(R.drawable.serce);
    }
    private void steak(ImageView Iv){
        Iv.setImageResource(R.drawable.steak_check);
    }
    private void tornado(ImageView Iv){
        Iv.setImageResource(R.drawable.tornado);
    }
    private void robot(ImageView Iv){
        Iv.setImageResource(R.drawable.robot);
    }
    private void zejak(ImageView Iv){
        Iv.setImageResource(R.drawable.zejak);
    }
    private void wulkan(ImageView Iv){
        Iv.setImageResource(R.drawable.wulkan);
    }
    private void zarowka(ImageView Iv){
        Iv.setImageResource(R.drawable.zarowka);
    }
    private void znak(ImageView Iv){
        Iv.setImageResource(R.drawable.znak_drogowy);
    }
    private void szklanka(ImageView Iv){
        Iv.setImageResource(R.drawable.szklanka);
    }
    private void future(ImageView Iv){
        Iv.setImageResource(R.drawable.future);
    }
    private void ksiazka(ImageView Iv){
        Iv.setImageResource(R.drawable.ksiazka);
    }
    private void nightWall(ImageView Iv){
        Iv.setImageResource(R.drawable.night_wall);
    }
    private void potato(ImageView Iv){
        Iv.setImageResource(R.drawable.pateto);
    }
    private void peace(ImageView Iv){
        Iv.setImageResource(R.drawable.peace);
    }
    private void strach(ImageView Iv){
        Iv.setImageResource(R.drawable.strach_przed_nieznanym);
    }
    private void wasidlo(ImageView Iv){
        Iv.setImageResource(R.drawable.wasidlo);
    }
    private void day_29(ImageView Iv){
        Iv.setImageResource(R.drawable.luty_29);
    }
}
