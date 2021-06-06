package com.example.bytecorptest.profile.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bytecorptest.R;
import com.example.bytecorptest.market.view.Market;
import com.example.bytecorptest.profile.adapter.PhotoAdapter;
import com.example.bytecorptest.profile.adapter.PostAdapter;
import com.example.bytecorptest.profile.model.ProfileModel;
import com.example.bytecorptest.profile.viewmodel.ProfileViewModel;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    PostAdapter adapterPost;
    PhotoAdapter adapterPhotos;
    Button posts;
    Button photos;
    ImageView homeIcon;
    ImageView profileIcon;
    TextView name;
    TextView hobby;
    RecyclerView recyclerView;

    ProfileViewModel profileViewModel = new ProfileViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        posts = findViewById(R.id.posts);
        photos = findViewById(R.id.photos);

        posts.setOnClickListener(postListener);
        photos.setOnClickListener(photosListener);
        recyclerView = findViewById(R.id.recyclerView);

        setData();
        initApaterPosts();


        View bottomNavigation = findViewById(R.id.bottomIncludeLayout);
        View homeIconLayout = bottomNavigation.findViewById(R.id.homeIconLayout);
        View profileIconLayout = bottomNavigation.findViewById(R.id.profileIconLayout);
        homeIcon = homeIconLayout.findViewById(R.id.homeIcon);
        profileIcon = profileIconLayout.findViewById(R.id.homeIcon);
        homeIcon.setOnClickListener(openMarket);
    }

    private void setData() {
        name = findViewById(R.id.nameTextView);
        hobby = findViewById(R.id.hobbyTextView);

        ProfileModel profileModel = profileViewModel.getProfileModel();
        name.setText(profileModel.getName());
        hobby.setText(profileModel.getHobby());

        adapterPost = new PostAdapter(this, profileViewModel.getPostModel());
        adapterPhotos = new PhotoAdapter(this, profileViewModel.getPhotoModel());

    }

    private void initApaterPosts() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));
        recyclerView.setAdapter(adapterPost);
        adapterPost.notifyDataSetChanged();
    }

    private void initApaterPhotos() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapterPhotos);
        adapterPhotos.notifyDataSetChanged();
    }

    private View.OnClickListener openMarket = new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(ProfileActivity.this, Market.class);
            startActivity(i);
        }
    };

    private View.OnClickListener postListener = new View.OnClickListener() {
        public void onClick(View v) {
            initApaterPosts();
        }
    };

    private View.OnClickListener photosListener = new View.OnClickListener() {
        public void onClick(View v) {
            initApaterPhotos();
        }
    };
}