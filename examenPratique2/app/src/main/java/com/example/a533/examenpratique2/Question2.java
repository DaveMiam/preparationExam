package com.example.a533.examenpratique2;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        setListener();



    }

    private void setListener() {
        findViewById(R.id.btn_merde).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.activity_main2);
            dialog.findViewById(R.id.buttonAyeCap).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"AYE CAPTAIN" , Toast.LENGTH_SHORT).show();

                }
            });
                dialog.findViewById(R.id.buttonAnnuler).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"it’s treason then" , Toast.LENGTH_SHORT).show();

                    }
                });
            dialog.show();
            }
        });
    }
}
