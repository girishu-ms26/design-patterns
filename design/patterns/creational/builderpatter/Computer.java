package design.patterns.creational.builderpatter;

public class Computer {
    private String HDD;
    private String RAM;
    private boolean bluetoothEnabled;
    private boolean graphicsCardEnabled;

    public Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
    }
    static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean bluetoothEnabled;
        private boolean graphicsCardEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD=HDD;
            this.RAM=RAM;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled){
            this.bluetoothEnabled=bluetoothEnabled;
            return this;
        }
        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled){
            this.graphicsCardEnabled=graphicsCardEnabled;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
