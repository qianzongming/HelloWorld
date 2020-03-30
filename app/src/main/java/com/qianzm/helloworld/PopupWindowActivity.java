package com.qianzm.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.qianzm.helloworld.util.ToastUtil;

public class PopupWindowActivity extends AppCompatActivity {
    private Button mBtnPop;
    private PopupWindow popupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);

        mBtnPop = findViewById(R.id.btn_pop);
        mBtnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_pop,null);
                popupWindow = new PopupWindow(view,mBtnPop.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setFocusable(true);
                popupWindow.showAsDropDown(mBtnPop);

                TextView textView = view.findViewById(R.id.tv_good);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                        ToastUtil.showMsg(PopupWindowActivity.this,"好");
                    }
                });

            }
        });
    }
}
