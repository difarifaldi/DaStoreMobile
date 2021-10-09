package com.example.dastore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {

    Context context;

    ArrayList<User> list;

    public MyAdapter(Context context, ArrayList<User> list) {
        this.context = context;

        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent, false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User user = list.get(position);
        holder.contactname.setText(user.getContactname());
        holder.contactemail.setText(user.getContactemail());
        holder.contactnumber.setText(user.getContactnumber());
        holder.typepayment.setText(user.getTypepayment());

    }

    @Override
    public int getItemCount() {

        return list.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView contactname, contactemail, contactnumber, typepayment;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            contactname = itemView.findViewById(R.id.contactname);
            contactemail = itemView.findViewById(R.id.contactemail);
            contactnumber = itemView.findViewById(R.id.contactnumber);
            typepayment = itemView.findViewById(R.id.typepayment);

        }
    }
}
