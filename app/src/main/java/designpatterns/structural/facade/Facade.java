package designpatterns.structural.facade;

public abstract class Facade {
    public abstract String operation();
}

class Facade1 extends Facade {
    private Class1 object1;
    private Class2 object2;
    private Class3 object3;

    public Facade1(Class1 c1, Class2 c2, Class3 c3) {
        this.object1 = c1;
        this.object2 = c2;
        this.object3 = c3;
    }

    public String operation() {
        return "operations made: " + object1.operation1() + " " + object2.operation2() + " " + object3.operation3();
    }
}

class Class1 {
    public String operation1() {
        return "operation1";
    }
}

class Class2 {
    public String operation2() {
        return "operation2";
    }
}

class Class3 {
    public String operation3() {
        return "operation3";
    }
}
