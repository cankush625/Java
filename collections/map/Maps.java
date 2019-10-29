package com.collections.map;
import java.util.Map;
import java.util.HashMap;

public class Maps {
    public void implementMap() {
        Map<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("java", "High level object oriented programming language");
        myHashMap.put("python", "Interpreted object oriented programming  language");

        if(myHashMap.containsKey("java")) {
            System.out.println("Key is already in the class");
        } else {
            myHashMap.put("java", "very popular programming language in software development");
        }

        for (String key : myHashMap.keySet()) {
            System.out.println(key + " : " + myHashMap.get(key));
        }
    }
}
