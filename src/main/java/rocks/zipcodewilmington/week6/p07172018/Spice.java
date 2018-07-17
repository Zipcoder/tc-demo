package rocks.zipcodewilmington.week6.p07172018;

/**
 * @author leon on 7/17/18.
 */
public abstract class Spice {
    private final Double price;
    private final Long serialNumber;

    Spice(Double price, Long serialNumber) {
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

}
