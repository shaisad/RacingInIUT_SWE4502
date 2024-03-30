import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class SprintRacing extends Race{

    public SprintRacing(Car car, Track track) {
        super(car, track);
    }

    @Override
    protected void finishLine(Track track) {
        track.crossFinishLine();
    }



}
