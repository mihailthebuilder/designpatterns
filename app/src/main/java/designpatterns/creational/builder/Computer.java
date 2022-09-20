package designpatterns.creational.builder;

public class Computer {

    // required parameters
    private int HddInGb;
    private int RamInGb;

    // optional parameters
    private boolean HasGraphicsCard;
    private boolean HasBluetooth;

    public int getHddInGb() {
        return HddInGb;
    }

    public int getRamInGb() {
        return RamInGb;
    }

    public boolean hasGraphicsCard() {
        return HasGraphicsCard;
    }

    public boolean hasBluetooth() {
        return HasBluetooth;
    }

    private Computer(ComputerBuilder builder) {
        this.HddInGb = builder.HddInGb;
        this.RamInGb = builder.RamInGb;
        this.HasGraphicsCard = builder.HasGraphicsCard;
        this.HasBluetooth = builder.HasBluetooth;
    }

    // Builder class
    public static class ComputerBuilder {
        // required parameters
        private int HddInGb;
        private int RamInGb;

        // optional parameters
        private boolean HasGraphicsCard;
        private boolean HasBluetooth;

        public ComputerBuilder(int hdd, int ram) {
            this.HddInGb = hdd;
            this.RamInGb = ram;
        }

        public ComputerBuilder setHasGraphicsCard(boolean hasGraphicsCard) {
            this.HasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public ComputerBuilder setHasBluetooth(boolean hasBluetooth) {
            this.HasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}