package designpatterns.creational.factorymethod;

public abstract class Cloud {
    private String logs;

    public void startOneServer() {
        this.logs = this.createServerFactoryMethod();
    }

    public abstract String createServerFactoryMethod();

    public String getLogs() {
        return this.logs;
    }
}

class AwsCloud extends Cloud {
    public String createServerFactoryMethod() {
        return "AWS server created";
    }
}

class GcpCloud extends Cloud {
    public String createServerFactoryMethod() {
        return "GCP server created";
    }
}
