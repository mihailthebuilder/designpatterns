package designpatterns.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CloudTest {
    @Test
    void testCreateServers() {
        Cloud awsCloud = new AwsCloud();
        awsCloud.startOneServer();
        assertEquals("AWS server created", awsCloud.getLogs());

        Cloud gcpCloud = new GcpCloud();
        gcpCloud.startOneServer();
        assertEquals("GCP server created", gcpCloud.getLogs());
    }
}
