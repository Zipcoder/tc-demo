package rocks.zipcodewilmington;

import java.awt.*;
import java.util.Date;

/**
 * @author leon on 6/25/18.
 */
public class GrayToy extends Toy {
    public GrayToy(Date providedDate) {
        super(Color.GRAY, providedDate);
    }


    public void someOtherMethodDownhere() {
        thisMethodIsAnExampleForHowInheritanceWorks();
    }
}
