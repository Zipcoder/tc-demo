package rocks.zipcodewilmington;

import java.awt.Color;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author leon on 6/25/18.
 */
public class Toy {
    private static Long numberOfToysCreated = 0L;

    private Long id;
    private Color myColor;
    private Date myDate;


    public Toy(Color providedColor, Date providedDate) {
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