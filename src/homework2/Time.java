package homework2;

import java.util.Random;

public class Time {
    public static void main(String[] args) {
        Random random = new Random();

        int seconds = random.nextInt(28800);
        int hours = (seconds/60/60);

        System.out.println(hours + " hours left until the end of the working day");
        System.out.println(seconds + " seconds left until the end of the working day" );


    }
}
