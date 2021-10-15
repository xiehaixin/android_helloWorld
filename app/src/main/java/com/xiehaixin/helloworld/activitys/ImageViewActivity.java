package com.xiehaixin.helloworld.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.xiehaixin.helloworld.R;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView iv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        iv5 = findViewById(R.id.iv_5);
        Glide.with(this)
                .load("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png")
                .into(iv5);
    }
}