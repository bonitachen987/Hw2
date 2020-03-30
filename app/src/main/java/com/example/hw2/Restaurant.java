package com.example.hw2;

import java.util.ArrayList;


public class Restaurant {
    private String name;
    private String cuisine;
    private String location;
    private String rating;


    public Restaurant(String name, String cuisine, String location, String rating){
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCuisine(){
        return cuisine;
    }

    public void setCuisine(String cuisine){
        this.cuisine = cuisine;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public static ArrayList<Restaurant> getRestaurants(){
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("El Jannah","Lebanese","Granville","4.8/5"));
        restaurants.add(new Restaurant("Chubby Buns", "American","Lidcombe","4.5/5"));
        restaurants.add(new Restaurant("Frangos", "Portuguese","Petersham","5/5"));
        restaurants.add(new Restaurant("Jang Ta Bal", "Korean","Strathfield","4.8/5"));
        restaurants.add(new Restaurant("Spice World","Chinese","CBD", "5/5"));
        restaurants.add(new Restaurant("GYG", "Mexican", "Surry Hills","4.5/5"));
        restaurants.add(new Restaurant("Vapiano", "Italian", "CBD","4/5"));
        restaurants.add(new Restaurant("Thai Gardens", "Thai", "Auburn","4.2/5"));
        restaurants.add(new Restaurant("Sushi Train", "Japanese", "Parramatta","4/5"));
        restaurants.add(new Restaurant("Pasta Bar","Italian","CBD","5/5"));


        return restaurants;

    }
}
