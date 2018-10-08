package rocks.zipcodewilmington.week11.p09052018;

/**
 * @author leon on 9/5/18.
 */
public enum StringEnumOption {
    HELLOWORLD("dasvhjdashjkdas "),
    HEYWORLD("Hey world"),
    WHASSUPWORLD("Whassup world?"),
    INTEGERENUM(1);

    private final String s;

    StringEnumOption(String s) {
        this.s = s;
    }

    StringEnumOption(Integer s) {
        this(s.toString());
    }

    public void printEnumString() {
        System.out.println(s);
    }
}
