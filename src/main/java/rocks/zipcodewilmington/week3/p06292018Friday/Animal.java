package rocks.zipcodewilmington.week3.p06292018Friday;

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
