package com.bignerdranch.admin.mycontact;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 2016/12/2.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{
    List<Contact> mContact;

    public Adapter(List<Contact> contacts){
        mContact = contacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        MyViewHolder holder = new MyViewHolder(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(mContact.get(position).getName());
        holder.number.setText(mContact.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return mContact.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView number;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            number= (TextView) itemView.findViewById(R.id.number);
            image= (ImageView) itemView.findViewById(R.id.image);

        }
    }
}
