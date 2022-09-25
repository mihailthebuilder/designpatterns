package designpatterns.structural.decorator;

public abstract class Component {
    public abstract String operation();
}

class Component1 extends Component {
    public String operation() {
        return "hello world from Component1";
    }
}

abstract class Decorator extends Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    protected abstract String addBehaviour(String input);

    public String operation() {
        return addBehaviour(component.operation());
    }
}

class Decorator1 extends Decorator {
    public Decorator1(Component component) {
        super(component);
    }

    protected String addBehaviour(String input) {
        return input + " inside Decorator1";
    }
}

class Decorator2 extends Decorator {
    public Decorator2(Component component) {
        super(component);
    }

    protected String addBehaviour(String input) {
        return input + " inside Decorator2";
    }
}