package com.packages_and_naming_conventions.scope_check.scope_challenge;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x + " = " + x * this.x);
        }
    }
}
