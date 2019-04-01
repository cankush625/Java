package com.oops.composition;

public class resolution {
    private int width;
    private int height;

    public resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawPixleAt(int x, int y, String color){
        System.out.println("Drawing pixle at "+x+", "+y+" in "+color+" color");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
