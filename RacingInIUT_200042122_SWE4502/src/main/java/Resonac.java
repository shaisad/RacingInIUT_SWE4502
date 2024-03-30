public class Resonac extends NOS {
    Car car;
    public Resonac(Car car) {
        this.car = car;
        System.out.println("Resonac NOS is added to " + car.getClass().getSimpleName());

    }

    @Override
    public void apply() {
        System.out.println("Applying Resonac Nitrous Oxide System");
    }

    @Override
    public NOS selectNOS() {
        return null;
    }
}

