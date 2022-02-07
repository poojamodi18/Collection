package advanced;

import java.util.concurrent.TimeUnit;

public class MilliSecondToSecondMinute {
    public static void main(String[] args) {
        long milli = 156757456;
        System.out.println("Second : "+(milli/1000));
        System.out.println("Minute : "+((milli/1000)/60));
        System.out.println("Hour : "+(((milli/1000)/60)/60));
        System.out.println("Day : "+(((((double)milli/1000)/60)/60)/24));

        //toMinutes() and toSecond() methods
        System.out.println("Second : "+ TimeUnit.MILLISECONDS.toSeconds(milli));
        System.out.println("Minute : "+ TimeUnit.MILLISECONDS.toMinutes(milli));
        System.out.println("Hour : "+ TimeUnit.MILLISECONDS.toHours(milli));
        System.out.println("Day : "+ TimeUnit.MILLISECONDS.toDays(milli));

    }
}
