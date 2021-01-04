package com.example.mynewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.lxj.xpopup.XPopup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showBtn(View view){
        new XPopup.Builder(this).asCustom(new WXLoginPopup(this)).show();
//        new XPopup.Builder(this).asCustom(new JoinVipPopup(this)).show();
    }
}