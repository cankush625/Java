package com.packages_and_naming_conventions.scope_check;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " : varThree = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " times 2 is " + i * varTwo);
        }

        //System.out.println("The value of i is now " + i); /*This gives an error for i because it is out of the scope*/

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " times 2 is " + i * this.varOne); /*If we want to use the global variable then we are specifying that variable in the code followed by this keyword*/
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("VarThree from outer class is " + innerClass.varThree);
    }

    public class InnerClass {
        public int varThree = 3;

        public InnerClass() {
            System.out.println("Inner class is created, varThree is " + varThree);
        }

        public void timesThree() {
            System.out.println("VarOne is still available here " + varOne);
            ScopeCheck.this.timesTwo(); //Adding method in Scopecheck class using this keyword
            for (int i = 0; i < 11; i++) {
                System.out.println(i + " times 3 is " + i * varThree);
            }
        }
    }
}