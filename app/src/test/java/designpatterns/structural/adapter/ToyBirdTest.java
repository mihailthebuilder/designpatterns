package designpatterns.structural.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ToyBirdTest {
    @Test
    void testToyBirdAdapter() {
        Sparrow sparrow = new Sparrow();
        assertEquals("chirp", sparrow.makeSound());

        ToyBird toySparrow = new BirdAdapter(sparrow);
        assertEquals("chirp", toySparrow.makeNoise());
    }
}