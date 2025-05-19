package com.example.profileapp.ui.profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.profileapp.model.UserProfile;
import com.example.profileapp.repository.ProfileRepository;

public class ProfileViewModel extends ViewModel {
    private MutableLiveData<UserProfile> profileLiveData;
    private ProfileRepository repository;

    public ProfileViewModel() {
        repository = new ProfileRepository();
        profileLiveData = new MutableLiveData<>();
        loadProfile();
    }

    private void loadProfile() {
        profileLiveData.setValue(repository.getUserProfile());
    }

    public LiveData<UserProfile> getProfile() {
        return profileLiveData;
    }
}

