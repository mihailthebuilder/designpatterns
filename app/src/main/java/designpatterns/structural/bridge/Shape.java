package designpatterns.structural.bridge;

interface Color {
    public String getColor();
}

public abstract class Shape {
    private Color color;

    public Shape(Color c) {
        this.color = c;
    }

    abstract public String getColor();
}

class Triangle extends Shape {
    public Triangle(Color c) {
        super(c);
    }

    public String getColor() {
        return this.getColor();
    }
}

class Square extends Shape {
    public Square(Color c) {
        super(c);
    }

    public String getColor() {
        return this.getColor();
    }
}