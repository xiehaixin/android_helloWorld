package com.xiehaixin.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xiehaixin.helloworld.activitys.ButtonActivity;
import com.xiehaixin.helloworld.activitys.CheckBoxActivity;
import com.xiehaixin.helloworld.activitys.EditTextActivity;
import com.xiehaixin.helloworld.activitys.RadioButtonActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);

        btn2 = findViewById(R.id.btn_2);

        btn3 = findViewById(R.id.btn_3);

        btn4 = findViewById(R.id.btn_4);

        btn5 = findViewById(R.id.btn_5);

        setOnClickListener(btn1, btn2, btn3, btn4, btn5);
    }


    private void setOnClickListener(Button... btns){
        for (Button btn : btns){
            btn.setOnClickListener(new OnClick());
        }
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_1:
                    // 跳转到TextView演示界面
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_2:
                    // 跳转到Button演示界面
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_3:
                    // 跳转到EditText演示界面
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_4:
                    // 跳转到RadioButton演示界面
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_5:
                    // 跳转到CheckBox演示界面
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }


}
