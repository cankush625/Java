package com.oops.composition;

public class case_ {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private dimensions dimensions;

    public case_(String model, String manufacturer, String powerSupply, dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button is pressed!");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public dimensions getDimensions() {
        return dimensions;
    }
}
