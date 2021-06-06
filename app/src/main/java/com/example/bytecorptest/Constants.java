package com.example.bytecorptest;

import com.example.bytecorptest.profile.model.PhotoModel;
import com.example.bytecorptest.profile.model.PostModel;
import com.example.bytecorptest.profile.model.ProfileModel;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static ProfileModel getListOfProfile() {
        ArrayList<PostModel> postModels = new ArrayList<>();

        postModels.add(new PostModel(1,"Nice work","the work that you did was very nice"));
        postModels.add(new PostModel(1,"Bad work","the work that you did was very nice and Bad work"));
        postModels.add(new PostModel(1,"Okay work","the work that you did was very nice,Okay work, Super work and Bad work"));
        postModels.add(new PostModel(1,"Hello work","the work that you did was very nice,Super work and Bad work "));
        postModels.add(new PostModel(1,"Super work","the work that you did was very nice,Hello work  and Bad work "));

        ArrayList<PhotoModel> photoModels = new ArrayList<>();
        photoModels.add(new PhotoModel(1));
        photoModels.add(new PhotoModel(2));
        photoModels.add(new PhotoModel(3));

        ProfileModel profileModels = new ProfileModel("Umer Ehsan","Something work related",1,photoModels,postModels);
        return profileModels;
    }
}
