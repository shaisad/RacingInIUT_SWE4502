public class SubaruBRZ extends CoupeCar {
    @Override
    void start() {
        System.out.println("Starting SubaruBRZ");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating SubaruBRZ");
    }

    @Override
    void stop() {
        System.out.println("Stopping SubaruBRZ");
    }


    @Override
    public NOS selectNOS() {
        return null;
    }
}
