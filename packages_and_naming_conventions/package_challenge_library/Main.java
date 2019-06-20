package com.packages_and_naming_conventions.package_challenge_library;

import com.packages_and_naming_conventions.package_challenge_library.my_library.Series;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}

//by Ankush Chavan