package com.qianzm.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox mCb5,mCb6,mCb7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        mCb5 = findViewById(R.id.cb_5);
        mCb6 = findViewById(R.id.cb_6);
        mCb7 = findViewById(R.id.cb_7);

        mCb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?buttonView.getText()+"选中":buttonView.getText()+"未选中",Toast.LENGTH_SHORT).show();
            }
        });

        mCb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?buttonView.getText()+"选中":buttonView.getText()+"未选中",Toast.LENGTH_SHORT).show();
            }
        });

        mCb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?buttonView.getText()+"选中":buttonView.getText()+"未选中",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
