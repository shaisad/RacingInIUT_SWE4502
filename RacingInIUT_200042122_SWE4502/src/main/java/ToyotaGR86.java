public class ToyotaGR86 extends CoupeCar {
    @Override
    void start() {
        System.out.println("Starting Toyota GR86");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating ToyotaGR86");
    }

    @Override
    void stop() {
        System.out.println("Stopping ToyotaGR86");
    }
    @Override
    public NOS selectNOS() {
        return null;
    }

}
