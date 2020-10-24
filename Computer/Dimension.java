package com.OOP_advanced.Computer;

public class Dimension {
    private int length;
    private int width;
    private int height;

    public Dimension(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

}
