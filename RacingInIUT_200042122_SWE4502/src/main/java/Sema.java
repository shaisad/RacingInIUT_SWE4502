public class Sema extends NOS {

    Car car;
    public Sema(Car car) {
        this.car = car;
        System.out.println("Sema NOS is added to " + car.getClass().getSimpleName());
    }
    @Override
    public void apply() {
        System.out.println("Applying Sema Nitrous Oxide System");
    }

    @Override
    protected NOS selectNOS() {
        return null;
    }
}

