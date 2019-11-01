package com.collections.map.adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits; //Defining the exits for the locations

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0); //Adding the exit from the game
    }

    public void addExit(String direction, int location) { //Method for adding exits
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}

//by Ankush Chavan