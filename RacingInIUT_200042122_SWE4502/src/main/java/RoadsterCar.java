class RoadsterCar extends Car {
    @Override
    void start() {
        System.out.println("Starting Roadster Car");
    }
    @Override
    void accelerate() {
        System.out.println("Accelerating Roadster Car");
    }

    @Override
    void stop() {
        System.out.println("Stopping Roadster Car");
    }

    @Override
    public NOS selectNOS() {
        return null;
    }
}