class CoupeCar extends Car {
    @Override
    void start() {
        System.out.println("Starting Coupe Car");
    }
    @Override
    void accelerate() {
        System.out.println("Accelerating Coupe Car");
    }
    @Override
    void stop() {
        System.out.println("Stopping Coupe Car");
    }
    @Override
    public NOS selectNOS() {
        return null;
    }
}