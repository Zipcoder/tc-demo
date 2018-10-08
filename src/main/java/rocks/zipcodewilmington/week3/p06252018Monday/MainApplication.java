package rocks.zipcodewilmington.week3.p06252018Monday;

import java.awt.*;
import java.util.Date;

/**
 * @author leon on 6/25/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Toy toy1 = new Toy(Color.BLACK, new Date());
        Toy toy2 = new Toy(Color.RED, new Date());
        Toy toy3 = new Toy(Color.GREEN, new Date());

        System.out.println(Toy.numberOfToysCreated);
    }
}

