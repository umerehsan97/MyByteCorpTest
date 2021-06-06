package com.example.bytecorptest.profile.viewmodel;

import com.example.bytecorptest.Constants;
import com.example.bytecorptest.profile.model.PhotoModel;
import com.example.bytecorptest.profile.model.PostModel;
import com.example.bytecorptest.profile.model.ProfileModel;
import com.example.bytecorptest.profile.service.ProfileService;

import java.util.List;

public class ProfileViewModel {
    ProfileService profileService = new ProfileService();

    public ProfileModel getProfileModel() {
        return profileService.getProfileModel();
    }
    public List<PhotoModel> getPhotoModel() {
        ProfileModel profileModels = Constants.getListOfProfile();
        return profileService.getPhotoModel();

    }public List<PostModel> getPostModel() {
        ProfileModel profileModels = Constants.getListOfProfile();
        return profileService.getPostModel();
    }
}
