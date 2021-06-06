package com.example.bytecorptest.profile.service;

import com.example.bytecorptest.Constants;
import com.example.bytecorptest.profile.model.PhotoModel;
import com.example.bytecorptest.profile.model.PostModel;
import com.example.bytecorptest.profile.model.ProfileModel;

import java.util.List;

public class ProfileService {
    public ProfileModel getProfileModel() {
        return Constants.getListOfProfile();
    }
    public List<PhotoModel> getPhotoModel() {
        ProfileModel profileModels = Constants.getListOfProfile();
        return profileModels.getPhotoModelList();

    }public List<PostModel> getPostModel() {
        ProfileModel profileModels = Constants.getListOfProfile();
        return profileModels.getPostModelList();
    }
}
