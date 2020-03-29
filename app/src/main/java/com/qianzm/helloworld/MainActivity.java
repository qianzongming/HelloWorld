package com.qianzm.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.qianzm.helloworld.gridview.GridViewActivity;
import com.qianzm.helloworld.listview.ListViewActivity;
import com.qianzm.helloworld.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListview;
    private Button mBtnGridview;
    private Button mBtnRecycleview;
    private Button mBtnWebview,mBtnToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnButton = findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });


        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });

        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        mBtnImageView = findViewById(R.id.btn_imageview);
        mBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnListview = findViewById(R.id.btn_listview);
        mBtnListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });


        mBtnGridview = findViewById(R.id.btn_gridview);
        mBtnGridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnRecycleview = findViewById(R.id.btn_recyclerview);
        mBtnRecycleview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });


        mBtnWebview = findViewById(R.id.btn_webview);
        mBtnWebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnToast = findViewById(R.id.btn_toast);
        mBtnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToastActivity.class);
                startActivity(intent);
            }
        });


    }
}
