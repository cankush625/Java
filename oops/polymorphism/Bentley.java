package com.oops.polymorphism;

class Bentley extends car{
    public Bentley(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        System.out.println("Bentley engine is started!");
        return "Ignition starts";
    }

    @Override
    public String accelerate() {
        System.out.println("Bentley is accelerated");
        return "Bentley is in motion";
    }

    @Override
    public String brake() {
        System.out.println("Brakes are applied");
        return "";
    }
}

