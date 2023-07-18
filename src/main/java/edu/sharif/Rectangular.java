package edu.sharif;

public class Rectangular implements Shape {

    private int width;
    private int height;

    public Rectangular() {
    }

    public Rectangular(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Integer computeArea() {
        return height * width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
