import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = Player.getInstance();
        Player player2 = Player.getInstance();

        System.out.println("Is it single player? " + (player1 == player2));
        System.out.println("Choose car type:");
        System.out.println("1. Coupe Car");
        System.out.println("2. Roadster Car");

        int carTypeChoice = scanner.nextInt();
        CarFactory carFactory = createCarFactory(carTypeChoice);

        Car car = chooseCarModel(carFactory);

        EngineBehaviour engine = chooseEngine();

        TurbochargerBehaviour turbocharger = chooseTurbocharger();

        car.setEngineBehavior(engine);
        car.setTurbochargerBehavior(turbocharger);

        System.out.println("Choose a track:");
        System.out.println("1. Blue Moon Bay Speedway (USA)");
        System.out.println("2. BB Raceway (Japan)");
        System.out.println("3. Circuit de Spa-Francorchamps (Germany)");

        int trackChoice = scanner.nextInt();
//        Track_Factory trackFactory = new Track_Factory();
        Track track = createTrack(trackChoice);

        startRace(car, track);

        scanner.close();
    }

    private static CarFactory createCarFactory(int carTypeChoice) {
        switch (carTypeChoice) {
            case 1:
                return new CoupeCarFactory();
            case 2:
                return new RoadsterCarFactory();
            default:
                throw new IllegalArgumentException("Invalid car type choice");
        }
    }
    private static Car chooseCarModel(CarFactory carFactory) {
        if (carFactory instanceof CoupeCarFactory) {
            return chooseCoupeCarModel((CoupeCarFactory) carFactory);
        } else if (carFactory instanceof RoadsterCarFactory) {
            return chooseRoadsterCarModel((RoadsterCarFactory) carFactory);
        } else {
            throw new IllegalArgumentException("Invalid car factory");
        }
    }

    private static Car chooseCoupeCarModel(CoupeCarFactory coupeCarFactory) {
        System.out.println("Choose Coupe Car:");
        System.out.println("1. ToyotaGR86");
        System.out.println("2. SubaruBRZ");

        int coupeCarChoice = scanner.nextInt();

        switch (coupeCarChoice) {
            case 1:
                return coupeCarFactory.createCar("ToyotaGR86");
            case 2:
                return coupeCarFactory.createCar("SubaruBRZ");
            default:
                throw new IllegalArgumentException("Invalid Coupe Car choice");
        }
    }

    private static Car chooseRoadsterCarModel(RoadsterCarFactory roadsterCarFactory) {
        System.out.println("Choose Roadster Car:");
        System.out.println("1. Ferrari812");
        System.out.println("2. PorscheBoxster");

        int roadsterCarChoice = scanner.nextInt();

        switch (roadsterCarChoice) {
            case 1:
                return roadsterCarFactory.createCar("Ferrari812");
            case 2:
                return roadsterCarFactory.createCar("PorscheBoxster");
            default:
                throw new IllegalArgumentException("Invalid Roadster Car choice");
        }
    }

    private static Track createTrack(int trackChoice) {
        Track_Factory trackFactory = new Track_Factory();
        switch(trackChoice) {
            case 1:
                return trackFactory.getTrack("BlueMoonBaySpeedwayUSA");
            case 2:
                return trackFactory.getTrack("BBRacewayJapan");
            case 3:
                return trackFactory.getTrack("CircuitDeSpaFrancorchampsGermany");
            default:
                throw new IllegalStateException("Invalid Track Choice" + trackChoice);
        }
    }

    private static EngineBehaviour chooseEngine() {
        System.out.println("Choose an engine:");
        System.out.println("1. V6");
        System.out.println("2. V8");
        System.out.println("3. V12");

        int engineChoice = scanner.nextInt();

        switch (engineChoice) {
            case 1:
                return new V6Engine();
            case 2:
                return new V8Engine();
            case 3:
                return new V12Engine();
            default:
                throw new IllegalArgumentException("Invalid engine choice");
        }
    }

    private static TurbochargerBehaviour chooseTurbocharger() {
        System.out.println("Choose a turbocharger:");
        System.out.println("1. Alpine");
        System.out.println("2. Cummins");
        System.out.println("3. Honeywell");

        int turboChoice = scanner.nextInt();

        switch (turboChoice) {
            case 1:
                return new AlpineTurbocharger();
            case 2:
                return new CumminsTurbocharger();
            case 3:
                return new HoneywellTurbocharger();
            default:
                throw new IllegalArgumentException("Invalid turbocharger choice");
        }
    }


    private static void startRace(Car car, Track track) {
        System.out.println("Choose the type of racing:");
        System.out.println("1. Sprint Racing");
        System.out.println("2. Circuit Racing");

        int racingTypeChoice = scanner.nextInt();

//        Race race = new Race(car, track);
        String racingTypeName;

        switch (racingTypeChoice) {
            case 1:
                racingTypeName = "Sprint Racing";
                break;
            case 2:
                racingTypeName = "Circuit Racing";
                break;
            default:
                System.out.println("Invalid racing type choice");
                return;
        }

        System.out.println("Starting " + racingTypeName + "....");

        if (racingTypeChoice == 1) {
            Race sprint = new SprintRacing(car, track);
            sprint.race();
        } else {
            Race circuit = new CircuitRacing(car, track);
            circuit.race();
        }
    }
}
