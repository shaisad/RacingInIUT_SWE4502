import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Race {
    protected final Car car;
    protected final Track track;

    public Race(Car car, Track track) {
        this.car = car;
        this.track = track;
    }

//    abstract void startCar(Car car);
//    abstract void startLine(Track track);
//    abstract  void accelerateCar(Car car);
//    abstract NOS pitStop(Car car);
//    abstract void applyNos(NOS nos);
//    abstract  void finishLine(Track track);
//    abstract  void stopCar(NOS nos);
//    abstract void lapTime();

//    protected int generateRandomLapTime() {
//        Random random = new Random();
//        return random.nextInt(100) + 60;
//    }
//
//    protected void displayFormattedTime(int lapTimeSeconds) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss.SSS");
//        String formattedTime = dateFormat.format(new Date(lapTimeSeconds * 1000));
//
//        System.out.println("Lap time: " + formattedTime);
//    }

    public final void race() {
        car.carInfo();
        track.trackInfo();
        startCar(car);
        startLine(track);
        accelerateCar(car);
        NOS nos = pitStop(car);
        applyNos(nos);
        finishLine(track);
        stopCar(nos); // car
        System.out.println("Racing Completed");
        lapTime();
    }


    protected void startCar(Car car) {
        car.start();
    }

    protected void startLine(Track track) {
        track.crossStartLine();
    }

    protected void accelerateCar(Car car) {
        car.accelerate();
    }

    protected NOS pitStop(Car car) {
        System.out.println("Performing Pit Stop");
        System.out.println("---------------------Pit Stop----------------------");
        NOS nos = null;
        System.out.println("Select NOS to apply: \n(1) Resonac\n(2) Sema\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                nos = new Resonac(car);
                break;
            case 2:
                nos = new Sema(car);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        return nos;
    }

    protected void applyNos(NOS nos) {
        if (nos != null) {
            nos.apply();
        } else {
            System.out.println("No NOS applied during the race");
        }
    }

    abstract void finishLine(Track track);

    protected void stopCar(NOS nos) {
        car.stop();

        if (nos != null) {
            nos.apply();
        } else {
            System.out.println("No NOS applied after stopping the car");
        }
    }

    protected void lapTime() {
        System.out.println("Calculating lap time...");
        int lapTimeSeconds = generateRandomLapTime();
        displayFormattedTime(lapTimeSeconds);
    }

    protected int generateRandomLapTime() {
        Random random = new Random();
        return random.nextInt(100) + 60;
    }

    protected void displayFormattedTime(int lapTimeSeconds) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss.SSS");
        String formattedTime = dateFormat.format(new Date(lapTimeSeconds * 1000));

        System.out.println("Lap time: " + formattedTime);
    }

}
