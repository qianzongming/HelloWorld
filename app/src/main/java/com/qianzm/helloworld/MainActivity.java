package com.qianzm.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClick onClick = new OnClick();
        mBtnUI = findViewById(R.id.btn_ui);
        mBtnUI.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_ui:
                    Intent intent = new Intent(MainActivity.this, UIActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }
}
