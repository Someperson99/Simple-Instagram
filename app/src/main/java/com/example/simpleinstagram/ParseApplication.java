package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1vHIxaMZh99jARAcwe9lrARqqh5Q5rMjnapJPj8r")
                .clientKey("gtGrsKmvBG4cGOEAPXGin8QvvdX2sujBELqopaup")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
