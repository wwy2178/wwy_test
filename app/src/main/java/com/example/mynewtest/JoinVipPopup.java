package com.example.mynewtest;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.lxj.xpopup.core.BottomPopupView;

public class JoinVipPopup extends BottomPopupView implements View.OnClickListener {

    TextView tvClose;
    RelativeLayout rl_month,rl_half_year,rl_all_year;
    LinearLayout llWxPay;
    Context context;
    Resources resources;

    public JoinVipPopup(@NonNull Context context) {
        super(context);
        this.context = context;
        resources = context.getResources();
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.join_vip_popup_layout;
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        tvClose = findViewById(R.id.tvClose);
        rl_month = findViewById(R.id.rl_month);
        rl_half_year = findViewById(R.id.rl_half_year);
        rl_all_year = findViewById(R.id.rl_all_year);
        llWxPay = findViewById(R.id.llWxPay);
        tvClose.setOnClickListener(this);
        rl_month.setOnClickListener(this);
        rl_half_year.setOnClickListener(this);
        rl_all_year.setOnClickListener(this);
        llWxPay.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvClose:
                dismiss();
                break;
            case R.id.rl_month:
                selectPayType(1);
                break;
            case R.id.rl_half_year:
                selectPayType(2);
                break;
            case R.id.rl_all_year:
                selectPayType(3);
                break;
            case R.id.llWxPay:

                break;
        }
    }

    private void selectPayType(int type){
        rl_month.setBackground(type == 1?resources.getDrawable(R.drawable.bg_5_d9a24e_1):resources.getDrawable(R.drawable.bg_5_e5e5e5_boder_1_fff));
        rl_half_year.setBackground(type == 2?resources.getDrawable(R.drawable.bg_5_d9a24e_1):resources.getDrawable(R.drawable.bg_5_e5e5e5_boder_1_fff));
        rl_all_year.setBackground(type == 3?resources.getDrawable(R.drawable.bg_5_d9a24e_1):resources.getDrawable(R.drawable.bg_5_e5e5e5_boder_1_fff));
    }
}
