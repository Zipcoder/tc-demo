package rocks.zipcodewilmington.week6.p07162018;

/**
 * @author leon on 7/16/18.
 */
public class Pair<SomeClassType, SomeOtherClassType> {
    private SomeClassType val1;
    private SomeOtherClassType val2;

    public Pair(SomeClassType object1, SomeOtherClassType object2) {
        this.val1 = object1;
        this.val2 = object2;
    }

    public SomeClassType getVal1() {
        return val1;
    }

    public void setVal1(SomeClassType val1) {
        this.val1 = val1;
    }

    public SomeOtherClassType getVal2() {
        return val2;
    }

    public void setVal2(SomeOtherClassType val2) {
        this.val2 = val2;
    }
}
