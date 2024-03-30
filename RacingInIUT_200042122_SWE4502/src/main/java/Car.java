public abstract class Car {

    EngineBehaviour engineBehavior;
    TurbochargerBehaviour turbochargerBehavior;


    abstract void start();

    abstract void accelerate();

    abstract void stop();


    void setEngineBehavior(EngineBehaviour engineBehavior) {
        this.engineBehavior = engineBehavior;
    }

    void setTurbochargerBehavior(TurbochargerBehaviour turbochargerBehavior) {
        this.turbochargerBehavior = turbochargerBehavior;
    }

    void carInfo() {
        System.out.println("Car Name: " + this.getClass().getSimpleName());
        engineBehavior.engineInfo();
        turbochargerBehavior.turboInfo();
    }


    protected abstract NOS selectNOS();
}
