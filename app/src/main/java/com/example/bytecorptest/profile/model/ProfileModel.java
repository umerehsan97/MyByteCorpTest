package com.example.bytecorptest.profile.model;

import java.util.List;

public class ProfileModel {
    String name;
    String hobby;
    int Image;
    List<PhotoModel> photoModelList;
    List<PostModel> postModelList;


    public ProfileModel(String name, String hobby, int image, List<PhotoModel> photoModelList, List<PostModel> postModelList) {
        this.name = name;
        this.hobby = hobby;
        Image = image;
        this.photoModelList = photoModelList;
        this.postModelList = postModelList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public List<PhotoModel> getPhotoModelList() {
        return photoModelList;
    }

    public void setPhotoModelList(List<PhotoModel> photoModelList) {
        this.photoModelList = photoModelList;
    }

    public List<PostModel> getPostModelList() {
        return postModelList;
    }

    public void setPostModelList(List<PostModel> postModelList) {
        this.postModelList = postModelList;
    }
}
