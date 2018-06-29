package rocks.zipcodewilmington.p06252018Monday;

import org.junit.Test;

import java.awt.*;
import java.util.Date;

/**
 * @author leon on 6/25/18.
 */
public class ToyTest {
    @Test
    public void testToyColor() {
        Date now = new Date();
        Color blue = new Color(0, 0, 255);
        Toy toy1 = new Toy(Color.BLUE, now);
        Toy toy2 = new Toy(blue, now);
        Toy toy3 = new Toy(blue, now);
        Toy toy4 = new Toy(blue, now);

        System.out.println("Color = " + toy1.getMyColor());
        System.out.println("Date = " + toy1.getMyDate());
        System.out.println("Id = " + toy1.getMyId());



        System.out.println("Toy 4's id = " + toy4.getMyId());

    }
}
