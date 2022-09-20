package designpatterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import designpatterns.creational.builder.Computer.ComputerBuilder;

public class ComputerTest {
    @Test
    void testComputer() {
        ComputerBuilder computerBuilder = new Computer.ComputerBuilder(500, 12);
        computerBuilder.setHasBluetooth(true);
        Computer computer = computerBuilder.build();

        assertEquals(true, computer.hasBluetooth());
        assertEquals(false, computer.hasGraphicsCard());
        assertEquals(500, computer.getHddInGb());
        assertEquals(12, computer.getRamInGb());
    }
}
