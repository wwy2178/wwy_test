package com.example.mynewtest;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.klinker.android.link_builder.Link;
import com.klinker.android.link_builder.LinkBuilder;
import com.lxj.xpopup.core.BottomPopupView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class WXLoginPopup extends BottomPopupView {

    ImageView imgClose;
    TextView wxLoginTv,xyTv;

    public WXLoginPopup(@NonNull Context context) {
        super(context);
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.wx_login_popup_layout;
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        imgClose = findViewById(R.id.imgClose);
        wxLoginTv = findViewById(R.id.wxLoginTv);
        xyTv = findViewById(R.id.xyTv);
        LinkBuilder.on(xyTv).addLinks(getTxtLiks())
                .build();
    }

    private List<Link> getTxtLiks(){
        List<Link> txtLinks = new ArrayList<>();
        Link userLink = new Link("用户协议")
                .setTextColor(Color.parseColor("#017AFF"))
                .setTextColorOfHighlightedLink(Color.parseColor("#0D3D0C")) // optional, defaults to holo blue
                .setHighlightAlpha(.4f)                                     // optional, defaults to .15f
                .setUnderlined(false)
                .setOnClickListener(new Link.OnClickListener() {
                    @Override
                    public void onClick(@NotNull String s) {

                    }
                });
        Link privateLink = new Link("隐私政策")
                .setTextColor(Color.parseColor("#017AFF"))
                .setTextColorOfHighlightedLink(Color.parseColor("#0D3D0C")) // optional, defaults to holo blue
                .setHighlightAlpha(.4f)                                     // optional, defaults to .15f
                .setUnderlined(false)
                .setOnClickListener(new Link.OnClickListener() {
                    @Override
                    public void onClick(@NotNull String s) {

                    }
                });
        txtLinks.add(userLink);
        txtLinks.add(privateLink);
        return txtLinks;
    }
}
