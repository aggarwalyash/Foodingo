package com.foodingo.foodingo;

public class TopRatedFoods {
    private String name;
    private int numOfItems;
    private int thumbnail;
    public TopRatedFoods(){
    }

    public TopRatedFoods(String name, int numOfItems, int thumbnail) {
        this.name = name;
        this.numOfItems = numOfItems;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfSongs(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    public int getThumbnail() {
        return thumbnail;
    }


}
