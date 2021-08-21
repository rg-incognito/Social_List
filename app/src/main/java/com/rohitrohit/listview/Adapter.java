package com.rohitrohit.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {


    public Adapter(ArrayList<String> social,ArrayList<String> imagelist) {
        this.social = social;
        this.imagelist = imagelist;
    }
    ArrayList<String> social;
    ArrayList<String> imagelist;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(social.get(position));
        Glide.with(holder.imageView.getContext()).load(imagelist.get(position)).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return social.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_textview);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
