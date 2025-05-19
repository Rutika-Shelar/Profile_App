package com.example.profileapp.repository;

import com.example.profileapp.model.UserProfile;

public class ProfileRepository {
    public UserProfile getUserProfile() {
        return new UserProfile("andaz kumar", "Dec, 2020");
    }
}