package com.charger.toast_wwy;

import android.app.Application;
import android.widget.Toast;

public class WwyTest {

    public void showWwyToast(Application ctx,String chars){
        Toast.makeText(ctx,chars,Toast.LENGTH_SHORT).show();
    }

    public int calculation(int number){
        return number*2;
    }
}
