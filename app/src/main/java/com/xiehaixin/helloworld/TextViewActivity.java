package com.xiehaixin.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mtv3, mtv5, mtv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        mtv3 = findViewById(R.id.tv_3);
        mtv3.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mtv3.getPaint().setAntiAlias(true);

        mtv5 = findViewById(R.id.tv_5);
        mtv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        mtv6 = findViewById(R.id.tv_6);
        mtv6.setText(Html.fromHtml("<u>HTML直接赋值，下划线</u>"));
    }
}