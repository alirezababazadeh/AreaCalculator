package edu.sharif;

import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void assertAreaComputation() {
        Shape shape = new Rectangular();
        assert shape.computeArea().equals(2);
    }

    @Test
    void assertRectangularAreaComputation() {
        Shape shape = new Rectangular(4, 5);
        assert shape.computeArea().equals(20);
    }

    @Test
    void assertSquareAreaComputation() {
        Shape shape = new Square(5);
        assert shape.computeArea().equals(25);
    }
}