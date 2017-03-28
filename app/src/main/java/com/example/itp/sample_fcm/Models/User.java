package com.example.itp.sample_fcm.Models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by ITP on 3/20/2017.
 */
@IgnoreExtraProperties
public class User {

    public String name;
    public String email;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}