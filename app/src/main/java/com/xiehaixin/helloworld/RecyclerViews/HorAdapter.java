package com.xiehaixin.helloworld.RecyclerViews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.xiehaixin.helloworld.R;

public class HorAdapter extends RecyclerView.Adapter<HorAdapter.MyViewHolder> {

    private Context context;

    public HorAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public HorAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_recycler_hor_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorAdapter.MyViewHolder holder, int position) {
        holder.textView.setText("Hello");
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.hor_tv_1);
        }
    }
}
