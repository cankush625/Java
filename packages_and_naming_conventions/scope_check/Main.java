package com.packages_and_naming_conventions.scope_check;

public class Main {
    public static void main(String[] args) {
        String privateVar = "This is the private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("ScopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();

        System.out.println("************************************");

        ScopeCheck.InnerClass innerClassInstance = scopeInstance.new InnerClass();
        innerClassInstance.timesThree();
    }
}
