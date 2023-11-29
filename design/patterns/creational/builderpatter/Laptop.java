package design.patterns.creational.builderpatter;

public class Laptop {
    private String brand;
    private String model;
    private int ram;
    private int hdd;
    private boolean graphicsCard;
    private boolean webcam;

    public Laptop(LaptopBuilder builder) {
        this.brand=builder.brand;
        this.model=builder.model;
        this.ram=builder.ram;
        this.hdd=builder.hdd;
        this.graphicsCard=builder.graphicsCard;
        this.webcam=builder.webcam;
    }
    static class LaptopBuilder {
        private String brand;
        private String model;
        private int ram;
        private int hdd;
        private boolean graphicsCard;
        private boolean webcam;

        public LaptopBuilder(String brand, String model, int ram, int hdd) {
            this.brand=brand;
            this.model=model;
            this.ram=ram;
            this.hdd=hdd;
        }

        public LaptopBuilder setGraphicsCardEnabled(boolean graphicsCard) {
            this.graphicsCard=graphicsCard;
            return this;
        }

        public LaptopBuilder setWebcam(boolean webcam) {
            this.webcam=webcam;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
