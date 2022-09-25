package designpatterns.structural.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComponentTest {
    @Test
    void testComponent() {
        Component c1 = new Component1();
        assertEquals("hello world from Component1", c1.operation());

        Decorator d1 = new Decorator1(c1);
        assertEquals("hello world from Component1 inside Decorator1", d1.operation());

        Decorator d2 = new Decorator2(d1);
        assertEquals("hello world from Component1 inside Decorator1 inside Decorator2", d2.operation());
    }
}
