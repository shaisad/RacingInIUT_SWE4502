import java.util.Scanner;

public class CircuitRacing extends Race{

    public CircuitRacing(Car car, Track track) {
        super(car, track);
    }

    @Override
    protected void finishLine(Track track) {
        track.crossStartLine();
    }


}
