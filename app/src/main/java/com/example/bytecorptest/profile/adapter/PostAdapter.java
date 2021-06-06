package com.example.bytecorptest.profile.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bytecorptest.R;
import com.example.bytecorptest.profile.model.PostModel;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<PostModel> mData;
    private LayoutInflater mInflater;

    // data is passed into the constructor
    public PostAdapter(Context context, List<PostModel> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.vh_posts, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String header = mData.get(position).getHeader();
        String body = mData.get(position).getBody();

        holder.headTextView.setText(header);
        holder.bodyTextView.setText(body);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView headTextView;
        TextView bodyTextView;

        ViewHolder(View itemView) {
            super(itemView);
            headTextView = itemView.findViewById(R.id.header);
            bodyTextView = itemView.findViewById(R.id.body);
        }


    }

    // convenience method for getting data at click position
    PostModel getItem(int id) {
        return mData.get(id);
    }


}