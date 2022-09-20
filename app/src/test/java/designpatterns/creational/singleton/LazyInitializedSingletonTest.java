package designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LazyInitializedSingletonTest {
    @Test
    void testGetInstance() {
        LazyInitializedSingleton firstInstance = LazyInitializedSingleton.getInstance();

        firstInstance.state = 5;

        LazyInitializedSingleton attemptToCreateAnotherInstance = firstInstance.getInstance();
        assertEquals(5, attemptToCreateAnotherInstance.state);

        LazyInitializedSingleton attemptToCreateAThirdInstance = LazyInitializedSingleton.getInstance();
        assertEquals(5, attemptToCreateAThirdInstance.state);
    }
}
