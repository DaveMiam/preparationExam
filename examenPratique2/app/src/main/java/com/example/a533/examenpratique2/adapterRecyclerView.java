package com.example.a533.examenpratique2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class adapterRecyclerView extends RecyclerView.Adapter<adapterRecyclerView.MyViewHolder>{
    List<jobOffeeModel> jobList;

    public adapterRecyclerView(List<jobOffeeModel> jobList){
        this.jobList = jobList;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titre;
        TextView description;
        TextView salaire;
        Button btn_fuck;
        public MyViewHolder(View itemView){
            super(itemView);
            titre= itemView.findViewById(R.id.txt_title);
            description= itemView.findViewById(R.id.txt_description);
            salaire= itemView.findViewById(R.id.txt_salaire);
            btn_fuck = itemView.findViewById(R.id.btn_delete);
        }
    }

    @NonNull
    public adapterRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_pageoffreemploi,parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(@NonNull adapterRecyclerView.MyViewHolder holder, final int position) {
        final jobOffeeModel jobToDisplay =  jobList.get(position);
        holder.titre.setText(jobToDisplay.getTitrePoste());
        holder.description.setText(jobToDisplay.getDescription());
        holder.salaire.setText(String.valueOf(jobToDisplay.getSlaire()));
        holder.btn_fuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jobList.remove(position);
                notifyDataSetChanged();
            }
        });

    }

    public int getItemCount() {
        return jobList.size();
    }


}
