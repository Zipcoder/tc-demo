package rocks.zipcodewilmington.p06292018;

/**
 * @author leon on 6/29/18.
 */
public class Animal {
    private int totalDistanceWalked;

    public String speak() {
        return "sound";
    }

    public void walk(int distance) {
        this.totalDistanceWalked += distance;
    }

    public int getTotalDistanceWalked() {
        return totalDistanceWalked;
    }
}
