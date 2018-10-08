package rocks.zipcodewilmington.week3.p06252018Monday;

import java.awt.Color;
import java.util.Date;

/**
 * @author leon on 6/25/18.
 */
public class Toy {
    public static Long numberOfToysCreated = 0L;

    private final Long id;
    private Color myColor;
    private Date myDate;


    public Toy(final Color providedColor, final Date providedDate) {
        this.myColor = providedColor;
        this.myDate = providedDate;
        this.id = ++numberOfToysCreated;
    }


    public Color getMyColor() {
        return this.myColor;
    }

    public void setMyColor(Color newColorToBeSet) {
        this.myColor = newColorToBeSet;
    }

    public Date getMyDate() {
        return this.myDate;
    }

    public Long getMyId() {
        return this.id;
    }

    protected void thisMethodIsAnExampleForHowInheritanceWorks() {

    }
}