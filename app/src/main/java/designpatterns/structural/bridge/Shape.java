package designpatterns.structural.bridge;

interface LengthOfASide {
    public int getLengthOfASide();
}

public abstract class Shape {
    protected LengthOfASide lengthOfASide;

    public Shape(LengthOfASide l) {
        this.lengthOfASide = l;
    }

    abstract public int getPerimeter();
}

class Triangle extends Shape {
    public Triangle(LengthOfASide l) {
        super(l);
    }

    public int getPerimeter() {
        return this.lengthOfASide.getLengthOfASide() * 3;
    }
}

class Square extends Shape {
    public Square(LengthOfASide l) {
        super(l);
    }

    public int getPerimeter() {
        return this.lengthOfASide.getLengthOfASide() * 4;
    }
}

class LengthOfASideOf3 implements LengthOfASide {
    public int getLengthOfASide() {
        return 3;
    }
}

class LengthOfASideOf10 implements LengthOfASide {
    public int getLengthOfASide() {
        return 10;
    }
}