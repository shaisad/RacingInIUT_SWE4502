class RoadsterCarFactory implements CarFactory {

    public Car createCar(String model) {
        switch (model) {
            case "Ferrari812":
                return new Ferrari812();
            case "PorscheBoxster":
                return new PorscheBoxster();
            default:
                throw new IllegalArgumentException("Invalid Coupe Car model");
        }
    }


    public EngineBehaviour createEngine() {
        return new V8Engine();
    }

    public TurbochargerBehaviour createTurbocharger() {
        return new CumminsTurbocharger();
    }

    public NOS selectNOS() {
        return null;
    }
}
