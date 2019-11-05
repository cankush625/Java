package com.collections.set.symmetric_asymmetric;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        //Union of all elements using allAll() method
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        //Intersection of elements using retainAll() method
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");

        //Printing all the elements in the intersection
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and cube of " + Math.cbrt(i));
        }

        //Adding words in the set
        Set<String> words = new HashSet<>();
        String sentence = "Hello Im Ankush Chavan";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        //Printing all the words in the set
        for (String s : words) {
            System.out.println(s);
        }

        Set<String> solar = new HashSet<>();
        Set<String> earth = new HashSet<>();

        String[] solarWords = {"it", "have", "planets", "and", "all", "solar", "bodies"};
        solar.addAll(Arrays.asList(solarWords)); //Adding array elements to the set

        String[] earthWords = {"it", "is", "the", "planet"};
        earth.addAll(Arrays.asList(earthWords)); //Adding array elements to the set

        //Asymmetric difference
        //using removeAll() method
        System.out.println("solar - earth");
        Set<String> diff1 = new HashSet<>(solar);
        diff1.removeAll(earth);
        printSet(diff1);

        System.out.println("earth - solar");
        Set<String> diff2 = new HashSet<>(earth);
        diff1.removeAll(solar);
        printSet(diff2);

        //Symmetric difference
        Set<String> unionTest = new HashSet<>(solar);
        unionTest.addAll(earth);
        Set<String> intersectionTest = new HashSet<>(solar);
        intersectionTest.retainAll(earth);

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        //Using containsAll()
        if (solar.containsAll(earth)) {
            System.out.println("earth is a subset of solar");
        }

        if (solar.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of solar");
        }

        if (earth.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of earth");
        }
    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

//by Ankush Chavan