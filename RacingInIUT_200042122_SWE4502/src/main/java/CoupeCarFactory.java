class CoupeCarFactory implements CarFactory {
    public Car createCar(String model) {
        switch (model) {
            case "ToyotaGR86":
                return new ToyotaGR86();
            case "SubaruBRZ":
                return new SubaruBRZ();
            default:
                throw new IllegalArgumentException("Invalid Coupe Car model");
        }
    }

    public EngineBehaviour createEngine() {
        return new V6Engine();
    }

    public TurbochargerBehaviour createTurbocharger() {
        return new AlpineTurbocharger();
    }

    public NOS selectNOS() {
        return null;
    }
}