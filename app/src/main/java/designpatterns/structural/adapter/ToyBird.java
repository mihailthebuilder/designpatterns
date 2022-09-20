package designpatterns.structural.adapter;

interface Bird {
    // source interface
    public String fly();

    public String makeSound();
}

class Sparrow implements Bird {
    public String fly() {
        return "flying";
    }

    public String makeSound() {
        return "chirp";
    }
}

interface ToyBird {
    // target interface
    public String makeNoise();
}

class BirdAdapter implements ToyBird {
    // You need to implement the interface your
    // client expects to use.
    Bird bird;

    public BirdAdapter(Bird bird) {
        // we need reference to the object we
        // are adapting
        this.bird = bird;
    }

    public String makeNoise() {
        // translate the methods appropriately
        return bird.makeSound();
    }
}