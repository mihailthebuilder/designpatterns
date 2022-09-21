package designpatterns.structural.bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test
    void testGetPerimeter() {
        Shape triangle = new Triangle(new LengthOfASideOf3());
        assertEquals(9, triangle.getPerimeter());

        Shape square = new Square(new LengthOfASideOf10());
        assertEquals(40, square.getPerimeter());
    }
}
