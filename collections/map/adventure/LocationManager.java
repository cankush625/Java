package com.collections.map.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LocationManager {
    private static Map<Integer, Location> locations = new HashMap<>(); //Hashmap for the locations

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creating locations
        locations.put(0, new Location(0, "You are on the top of the building"));
        locations.put(1, new Location(1, "You are in the home"));
        locations.put(2, new Location(2, "You are on the top of the hill"));
        locations.put(3, new Location(3, "You are swimming in the ocean"));
        locations.put(4, new Location(4, "You are in the aeroplane"));
        locations.put(5, new Location(5, "You are in the forest"));

        //Adding exits for the locations
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
//        locations.get(1).addExit("Q", 0); //Instead add once in the constructor of the locations

        locations.get(2).addExit("N", 5);
//        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
//        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
//        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");

        int loc = 1;

        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            //Copying all the exits for the entered location in exits map
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are : ");
            for (String exit : exits.keySet()) { //Printing all the exits for the entered location
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word:
                     words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}

//by Ankush Chavan