package designpatterns.creational.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    public int state;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }

        return instance;
    }
}
