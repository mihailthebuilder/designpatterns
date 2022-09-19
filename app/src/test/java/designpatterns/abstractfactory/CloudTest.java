package designpatterns.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CloudTest {
    @Test
    void testCreateServers() {
        Cloud awsCloud = new Cloud(new AwsServerFactory());
        awsCloud.startOneServer();
        assertEquals("AWS server created", awsCloud.getLogs());

        Cloud gcpCloud = new Cloud(new GcpServerFactory());
        gcpCloud.startOneServer();
        assertEquals("GCP server created", gcpCloud.getLogs());
    }
}
