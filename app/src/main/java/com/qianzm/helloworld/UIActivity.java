package com.qianzm.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qianzm.helloworld.gridview.GridViewActivity;
import com.qianzm.helloworld.listview.ListViewActivity;
import com.qianzm.helloworld.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListview;
    private Button mBtnGridview;
    private Button mBtnRecycleview;
    private Button mBtnWebview,mBtnToast,mBtnDialog,mBtnProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnButton = findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });


        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });

        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this,RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        mBtnImageView = findViewById(R.id.btn_imageview);
        mBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnListview = findViewById(R.id.btn_listview);
        mBtnListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });


        mBtnGridview = findViewById(R.id.btn_gridview);
        mBtnGridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnRecycleview = findViewById(R.id.btn_recyclerview);
        mBtnRecycleview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });


        mBtnWebview = findViewById(R.id.btn_webview);
        mBtnWebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnToast = findViewById(R.id.btn_toast);
        mBtnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, ToastActivity.class);
                startActivity(intent);
            }
        });

        mBtnDialog = findViewById(R.id.btn_dialog);
        mBtnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });


        mBtnProgress = findViewById(R.id.btn_progress);
        mBtnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, ProgressActivity.class);
                startActivity(intent);
            }
        });


    }
}
