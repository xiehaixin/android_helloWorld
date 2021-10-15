package com.xiehaixin.helloworld.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.xiehaixin.helloworld.R;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox cb5, cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb5 = findViewById(R.id.cb_5);
        cb6 = findViewById(R.id.cb_6);

        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked ? buttonView.getText()+"选中" : buttonView.getText()+"未选中", Toast.LENGTH_SHORT).show();
            }
        });
        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked ? buttonView.getText()+"选中" : buttonView.getText()+"取消选中", Toast.LENGTH_SHORT).show();
            }
        });
    }
}