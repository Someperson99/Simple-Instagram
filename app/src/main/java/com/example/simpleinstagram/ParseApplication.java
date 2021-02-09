package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1vHIxaMZh99jARAcwe9lrARqqh5Q5rMjnapJPj8r")
                .clientKey("gtGrsKmvBG4cGOEAPXGin8QvvdX2sujBELqopaup")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
