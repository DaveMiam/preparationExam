package com.example.a533.examenpratique2;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    List<jobOffeeModel> jobList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new adapterRecyclerView(jobList);
        recyclerView.setAdapter(adapter);
        remplirCard();
    }

    public void remplirCard(){
        jobOffeeModel jobOffer;
        jobOffer =  new  jobOffeeModel("","",0);
        jobOffeeModel jobOffer2 =  new  jobOffeeModel("","",0);
        jobOffeeModel jobOffer3 =  new  jobOffeeModel("","",0);
        List<jobOffeeModel> list = new ArrayList<jobOffeeModel>() ;

        jobOffer.setTitrePoste("mineur");
        jobOffer.setDescription("miner");
        jobOffer.setSlaire(2);
        list.add(jobOffer);

        jobOffer2.setTitrePoste("enfant");
        jobOffer2.setDescription("vivre");
        jobOffer2.setSlaire(1);
        list.add(jobOffer2);


        jobOffer3.setTitrePoste("enfahgfhdfghnt");
        jobOffer3.setDescription("vihghdfhgrdvre");
        jobOffer3.setSlaire(1);
        list.add(jobOffer3);

        jobList.addAll(list);
    }



}
