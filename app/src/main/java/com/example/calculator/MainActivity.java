package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
//这是新加的

public class MainActivity extends AppCompatActivity {
    private Button bt1;
    private Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        bt1=(Button)findViewById(R.id.btn_login);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpToLayout1();
            }
        });
        bt2=(Button)findViewById(R.id.btn_signin);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumpToLayout2();
            }
        });
    }
    public void jumpToLayout1(){
        setContentView(R.layout.activity_login);
//        bt2=(Button)findViewById(R.id.btn_signin);
//        bt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                jumpToLayout1();
//            }
//        });
    }
    public void jumpToLayout2(){
        setContentView(R.layout.activity_sign);
//        bt1=(Button)findViewById(R.id.button1);
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                jumpToLayout2();
//            }
//        });
    }

}
