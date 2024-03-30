public class Ferrari812 extends RoadsterCar{
    @Override
    void start() {
        System.out.println("Starting Ferrari812");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating Ferrari812");
    }

    @Override
    void stop() {
        System.out.println("Stopping Ferrari812");
    }

    @Override
    public NOS selectNOS() {
        return null;
    }
}
