package edu.sharif;

public class Square implements Shape {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public Integer computeArea() {
        return width * width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
