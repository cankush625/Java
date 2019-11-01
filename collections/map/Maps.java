package com.collections.map;
import java.util.Map;
import java.util.HashMap;

public class Maps {
    public void implementMap() {
        Map<String, String> myHashMap = new HashMap<>();

        myHashMap.put("java", "High level object oriented programming language");
        myHashMap.put("python", "Interpreted object oriented programming  language");
        myHashMap.put("javascript", "The awesome scripting language");
        myHashMap.put("c", "This is the very old language");

        //Checking if the java key is exist
        if(myHashMap.containsKey("java")) {
            System.out.println("Key is already in the class");
        } else {
            myHashMap.put("java", "very popular programming language in software development");
        }

        //Remove entry only if the key value pair is match
        if(myHashMap.remove("javascript", "Mainly used for frontend web development")) {
            System.out.println("Javascript is removed");
        } else {
            System.out.println("Javascript is not removed, key/value pair doesn't match");
        }

        //Removing the value using key
        myHashMap.remove("javascript");

        //Printing all the records in the Hashset
        for (String key : myHashMap.keySet()) {
            System.out.println(key + " : " + myHashMap.get(key));
        }

        //Replacing the value of the key
        if (myHashMap.replace("c", "This is the very old language", "This language is mainly used for OS programming or port programming")) {
            System.out.println("Value for c is replaced");
        } else {
            System.out.println("Value is not replaced");
        }

        System.out.println(myHashMap.get("c"));
    }
}

//by Ankush Chavan