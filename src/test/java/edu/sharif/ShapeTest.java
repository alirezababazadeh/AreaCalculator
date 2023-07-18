package edu.sharif;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void assertAreaComputation() {
        Shape shape = new Rectangular(4, 5);
        assert shape.computeArea().equals(20);
    }
}