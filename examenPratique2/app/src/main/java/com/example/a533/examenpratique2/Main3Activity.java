package com.example.a533.examenpratique2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setListener();
    }

    private void setListener() {
        findViewById(R.id.btn_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomView customView = findViewById(R.id.customView);
                customView.setInput("0");
                customView.invalidate();
            }
        });
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomView customView = findViewById(R.id.customView);
                customView.setInput("1");
                customView.invalidate();
            }
        });
    }


}
