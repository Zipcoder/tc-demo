package rocks.zipcodewilmington.week3.p06262018Tuesday;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 6/26/18.
 */
public class CalculatorTest {
    @Test
    public void addTest() {
        // Given
        Calculator ti83 = new Calculator();
        int firstValue = 5;
        int valueToAdd = 3;
        int expected = firstValue + valueToAdd;

        // When
        int actual = ti83.add(firstValue, valueToAdd);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
