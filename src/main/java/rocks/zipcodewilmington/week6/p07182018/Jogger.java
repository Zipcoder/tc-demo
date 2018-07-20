package rocks.zipcodewilmington.week6.p07182018;

/**
 * @author leon on 7/18/18.
 */
public class Jogger implements Runnable {
    private final String name;
    private short timeRunning;

    public Jogger(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (; timeRunning < 15; timeRunning++) {
            System.out.println(name + " has been running for " + timeRunning + " minutes");
        }
    }
}
