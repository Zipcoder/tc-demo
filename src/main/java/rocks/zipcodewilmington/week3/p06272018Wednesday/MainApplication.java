package rocks.zipcodewilmington.week3.p06272018Wednesday;

/**
 * @author leon on 6/27/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        useFlyer(new Plane());
    }

    public static void useFlyer(Flyer flyer) {
        flyer.fly();
        if(flyer instanceof Bird) {
            ((Bird) flyer).chirp();
        }
    }
}
