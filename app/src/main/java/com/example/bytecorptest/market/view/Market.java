package com.example.bytecorptest.market.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bytecorptest.R;
import com.example.bytecorptest.login.view.LoginActivity;
import com.example.bytecorptest.market.adapter.MarketAdapter;
import com.example.bytecorptest.market.model.MarketModel;
import com.example.bytecorptest.profile.view.ProfileActivity;

import java.util.ArrayList;

public class Market extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    MarketAdapter marketAdapter;
    ImageView homeIcon;
    ImageView profileIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        recyclerView=findViewById(R.id.marketRecyclerView);
        recyclerView2=findViewById(R.id.marketRecyclerView2);



        ArrayList<MarketModel> marketModels= new ArrayList<>();
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketModels.add(new MarketModel("Item #1 Name Goes here","$19.99",1));
        marketAdapter=new MarketAdapter(this,marketModels);
        initMarketAdapter();
        initMarketAdapter2();


        View bottomNavigation = findViewById(R.id.bottomIncludeLayout);
        View homeIconLayout = bottomNavigation.findViewById(R.id.homeIconLayout);
        View profileIconLayout = bottomNavigation.findViewById(R.id.profileIconLayout);
        homeIcon = homeIconLayout.findViewById(R.id.homeIcon);
        profileIcon = profileIconLayout.findViewById(R.id.profileIcon);
        profileIcon.setOnClickListener(openProfile);
    }


    private View.OnClickListener openProfile = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(Market.this, ProfileActivity.class);
            startActivity(i);
        }
    };



    private void initMarketAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(marketAdapter);
        marketAdapter.notifyDataSetChanged();
    }
    private void initMarketAdapter2() {
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setAdapter(marketAdapter);
        marketAdapter.notifyDataSetChanged();
    }
}