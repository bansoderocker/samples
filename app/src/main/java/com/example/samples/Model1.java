package com.example.samples;

import android.net.Uri;

public class Model1 {

    Uri images;

    public  Model1(Uri images){
        this.images=images;
    }

    public Uri getImages() {
        return images;
    }

    public void setImages(Uri images) {
        this.images = images;
    }
}
