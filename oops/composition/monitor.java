package com.oops.composition;

public class monitor {
    private String model;
    private String manufacturer;
    private int size;
    private resolution nativeResolution;

    public monitor(String model, String manufacturer, int size, resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public resolution getNativeResolution() {
        return nativeResolution;
    }
}
