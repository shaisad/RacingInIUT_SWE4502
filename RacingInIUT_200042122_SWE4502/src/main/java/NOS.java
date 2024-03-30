public abstract class NOS extends Car {

    @Override
    void start() {
        System.out.println("Starting NOS");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating with NOS");
    }

    @Override
    void stop() {
        System.out.println("Stopping with NOS");
    }

    public abstract void apply();
}
