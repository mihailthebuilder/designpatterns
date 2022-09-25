package designpatterns.structural.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FacadeTest {
    @Test
    void testFacade() {
        Facade f1 = new Facade1(new Class1(), new Class2(), new Class3());
        assertEquals("operations made: operation1 operation2 operation3", f1.operation());
    }
}
