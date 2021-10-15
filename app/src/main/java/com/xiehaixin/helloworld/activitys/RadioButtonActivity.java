package com.xiehaixin.helloworld.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.xiehaixin.helloworld.R;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioGroup rg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        rg1 = findViewById(R.id.rg_1);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = group.findViewById(checkedId);
                Toast.makeText(RadioButtonActivity.this, rb.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}