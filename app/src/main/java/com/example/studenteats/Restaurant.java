package com.example.studenteats;

public class Restaurant {
    private String name;
    private String location;
    private float rating;

    public Restaurant(String name, String location, float rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getRating() {
        return rating;
    }
}
