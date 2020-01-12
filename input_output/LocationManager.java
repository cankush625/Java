package com.input_output;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class LocationManager {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Adding vocabulary to recognize commands
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