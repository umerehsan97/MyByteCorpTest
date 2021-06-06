package com.example.bytecorptest.profile.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bytecorptest.R;
import com.example.bytecorptest.profile.model.PhotoModel;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {

    private List<PhotoModel> mData;
    private LayoutInflater mInflater;
    private Context context;

    // data is passed into the constructor
    public PhotoAdapter(Context context, List<PhotoModel> data) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.vh_photos, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PhotoModel picture = mData.get(position);
        if(picture.getImageId() == 1) {
            holder.imageView.setImageResource(R.drawable.noman1);
        } else if(picture.getImageId() == 2) {
            holder.imageView.setImageResource(R.drawable.noman2);
        } else if (picture.getImageId() == 3) {
            holder.imageView.setImageResource(R.drawable.noman3);
        }
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
        }


    }

    // convenience method for getting data at click position
    PhotoModel getItem(int id) {
        return mData.get(id);
    }


}