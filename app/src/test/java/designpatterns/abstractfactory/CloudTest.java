package designpatterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CloudTest {
    @Test
    void testCreateServers() {
        Cloud cloud1 = new Cloud(new AwsServerFactory());
        cloud1.startOneServer();
        assertEquals("AWS server created", cloud1.getLogs());

        Cloud cloud2 = new Cloud(new GcpServerFactory());
        cloud2.startOneServer();
        assertEquals("GCP server created", cloud2.getLogs());
    }
}
