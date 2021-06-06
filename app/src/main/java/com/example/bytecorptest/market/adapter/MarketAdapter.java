package com.example.bytecorptest.market.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bytecorptest.R;
import com.example.bytecorptest.market.model.MarketModel;

import java.util.List;


public class MarketAdapter extends RecyclerView.Adapter<MarketAdapter.ViewHolder> {

    private List<MarketModel> mData;
    private LayoutInflater mInflater;

    // data is passed into the constructor
    public MarketAdapter(Context context, List<MarketModel> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public MarketAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.vh_item, parent, false);
        return new MarketAdapter.ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(MarketAdapter.ViewHolder holder, int position) {
        String titleString = mData.get(position).getTitle();
        String priceString = mData.get(position).getPrice();

        holder.title.setText(titleString);
        holder.price.setText(priceString);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView price;

        ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_textview);
            price = itemView.findViewById(R.id.price);
        }


    }

    // convenience method for getting data at click position
    MarketModel getItem(int id) {
        return mData.get(id);
    }


}