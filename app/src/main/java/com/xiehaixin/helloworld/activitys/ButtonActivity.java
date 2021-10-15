package com.xiehaixin.helloworld.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.xiehaixin.helloworld.R;

public class ButtonActivity extends AppCompatActivity {

    private TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        tv6 = findViewById(R.id.tv6);
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "文字5，我被点击了", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void showToast(View v){
        Toast.makeText(this, "我被点击了", Toast.LENGTH_LONG).show();
    }
}