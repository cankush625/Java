package com.packages_and_naming_conventions.scope_check;

public class Main {
    public static void main(String[] args) {
        String varFour = "This is the private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("ScopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();

        System.out.println("************************************");

        ScopeCheck.InnerClass innerClassInstance = scopeInstance.new InnerClass();
        innerClassInstance.timesThree();

        System.out.println("************************************");

        scopeInstance.useInner();
    }
}
