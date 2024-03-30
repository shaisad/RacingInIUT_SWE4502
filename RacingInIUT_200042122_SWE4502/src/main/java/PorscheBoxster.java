public class PorscheBoxster extends RoadsterCar{
    @Override
    void start() {
        System.out.println("Starting PorscheBoxster");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating PorscheBoxster");
    }

    @Override
    void stop() {
        System.out.println("Stopping PorscheBoxster");
    }

    @Override
    public NOS selectNOS() {
        return null;
    }


}
