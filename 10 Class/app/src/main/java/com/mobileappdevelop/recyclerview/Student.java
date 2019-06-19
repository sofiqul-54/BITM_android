package com.mobileappdevelop.recyclerview;

public class Student {
    private String name;
    private String gender;
    private String id;
    private int profileImage;
    private String batch;


    public Student() {
    }

    public Student(String name, String gender, String id, int profileImage, String batch) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.profileImage = profileImage;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public String getBatch() {
        return batch;
    }
}
