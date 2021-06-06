package com.example.bytecorptest.profile.model;

import java.util.List;

public class PostModel {
    int imageId;
    String header;
    String body;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PostModel(int imageId, String header, String body) {
        this.imageId = imageId;
        this.header = header;
        this.body = body;

    }
}
