package rocks.zipcodewilmington.week6.p07182018;

/**
 * @author leon on 7/18/18.
 */
public class WaitUtility {
    public static void sleep(long timeToWaitInMilliseconds) {
        try {
            Thread.sleep(timeToWaitInMilliseconds);
        } catch (InterruptedException e) {
            System.out.println("INTERRUPTED");
        }
    }
}
