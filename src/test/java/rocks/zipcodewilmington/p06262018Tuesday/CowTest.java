package rocks.zipcodewilmington.p06262018Tuesday;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 6/26/18.
 */
public class CowTest {
    @Test
    public void speakTest() {
        // Given (a cow)
        Cow cow = new Cow(null);
        String expected = "moo";

        // When (a cow speaks)
        String actual = cow.speak();

        // Then (expect "moo")
        Assert.assertEquals(expected, actual);
    }
}
