package rocks.zipcodewilmington;

import java.awt.*;
import java.util.Date;

/**
 * @author leon on 6/25/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Date now = new Date();
        Color blue = new Color(0,0,255);
        Toy blueToy = new Toy(Color.BLUE, now);
    }
}

