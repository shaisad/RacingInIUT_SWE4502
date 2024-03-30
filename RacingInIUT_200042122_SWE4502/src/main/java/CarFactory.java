interface CarFactory {
    Car createCar(String model);

    EngineBehaviour createEngine();

    TurbochargerBehaviour createTurbocharger();

    NOS selectNOS();
}
