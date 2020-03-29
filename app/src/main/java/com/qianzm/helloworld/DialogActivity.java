package com.qianzm.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.qianzm.helloworld.util.ToastUtil;

public class DialogActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        button1 = findViewById(R.id.btn_dialog1);
        button2 = findViewById(R.id.btn_dialog2);
        button3 = findViewById(R.id.btn_dialog3);
        button4 = findViewById(R.id.btn_dialog4);
        button5 = findViewById(R.id.btn_dialog5);
        OnClick onClick = new OnClick();
        button1.setOnClickListener(onClick);
        button2.setOnClickListener(onClick);
        button3.setOnClickListener(onClick);
        button4.setOnClickListener(onClick);
        button5.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_dialog1:
                    AlertDialog.Builder builder = new AlertDialog.Builder((DialogActivity.this));
                    builder.setTitle("请回答").setMessage("你觉得这个APP如何?")
                            .setIcon(R.drawable.user_profile)
                            .setPositiveButton("棒", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    ToastUtil.showMsg(DialogActivity.this,"你很诚实");
                                }
                            }).setNeutralButton("还行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,"你在瞅瞅");
                        }
                    }).setNegativeButton("不行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,"睁眼说瞎话");
                        }
                    }).show();
                    break;
                case R.id.btn_dialog2:
                    final String[] sexes = new String[]{
                            "男","女"
                    };
                    AlertDialog.Builder builder2 = new AlertDialog.Builder((DialogActivity.this));
                    builder2.setTitle("选择性别").setItems(sexes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,sexes[which]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog3:
                    final String[] sexes3 = new String[]{
                            "男","女"
                    };
                    AlertDialog.Builder builder3 = new AlertDialog.Builder((DialogActivity.this));
                    builder3.setTitle("选择性别");
                    builder3.setCancelable(false);//点击空白处不消失
                    builder3.setSingleChoiceItems(sexes3, 1, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,sexes3[which]);
                            dialog.dismiss();

                        }
                    }).show();
                    break;
                case R.id.btn_dialog4:
                    final String[] hobbies = new String[]{
                            "唱歌","跳舞","写代码"
                    };
                    boolean[] isSelected = new boolean[]{
                            false,false,true
                    };
                    AlertDialog.Builder builder4 = new AlertDialog.Builder((DialogActivity.this));
                    builder4.setTitle("选择兴趣").setMultiChoiceItems(hobbies, isSelected, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            ToastUtil.showMsg(DialogActivity.this,hobbies[which]+":" + isChecked);
                        }
                    }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                    break;
                case R.id.btn_dialog5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder((DialogActivity.this));
                    View view = LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog,null);
                    EditText etUserName = view.findViewById(R.id.et_usename);
                    EditText etPassword = view.findViewById(R.id.et_password);
                    Button btnLogin = view.findViewById(R.id.btn_login);
                    btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });

                    builder5.setTitle("请先登录").setView(view).show();
                    break;
            }
        }
    }
}
