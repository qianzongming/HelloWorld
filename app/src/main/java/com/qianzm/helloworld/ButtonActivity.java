package com.qianzm.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;
    private TextView mTv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        mBtn3 = findViewById(R.id.btn3);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Button3被点击了", Toast.LENGTH_SHORT).show();

            }
        });


        mTv1 = findViewById(R.id.tv_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "TextView1被点击了", Toast.LENGTH_SHORT).show();
            }
        });
    }
    
    public void showToast(View v ){
        Toast.makeText(this, "Button4被点击了", Toast.LENGTH_SHORT).show();
    }
}
