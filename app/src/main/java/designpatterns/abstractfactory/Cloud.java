package designpatterns.abstractfactory;

public class Cloud {
    private ServerFactory serverFactory;
    private String logs;

    public Cloud(ServerFactory factory) {
        this.serverFactory = factory;
    }

    public void startOneServer() {
        this.logs = this.serverFactory.createServer();
    }

    public String getLogs() {
        return this.logs;
    }
}

interface ServerFactory {
    String createServer();
}

class AwsServerFactory implements ServerFactory {
    public String createServer() {
        return "AWS server created";
    }
}

class GcpServerFactory implements ServerFactory {
    public String createServer() {
        return "GCP server created";
    }
}
