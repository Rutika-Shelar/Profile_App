package com.example.profileapp.model;

public class UserProfile {
    private String name;
    private String memberSince;

    public UserProfile(String name, String memberSince) {
        this.name = name;
        this.memberSince = memberSince;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }
}