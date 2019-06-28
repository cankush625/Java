package com.packages_and_naming_conventions.scope_check;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " : privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " times 2 is " + i * privateVar);
        }

        //System.out.println("The value of i is now " + i); /*This gives an error for i because it is out of the scope*/

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " times 2 is " + i * this.privateVar); /*If we want to use the global variable then we are specifying that variable in the code followed by this keyword*/
        }
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("Inner class is created, privateVar is " + privateVar);
        }

        public void timesThree() {
            ScopeCheck.this.timesTwo(); //Adding method in Scopecheck class using this keyword
            for (int i = 0; i < 11; i++) {
                System.out.println(i + " times 3 is " + i * privateVar);
            }
        }
    }
}