package rocks.zipcodewilmington.week6.p07172018.marketplace.spices;

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

    public String toString() {
        return new StringBuilder()
                .append("\n\n\n{\n  Spice type: " + getClass().getSimpleName())
                .append("\n  Serial Number: " + serialNumber)
                .append("\n  Price: " + price +"\n}")
                .toString();
    }

}
