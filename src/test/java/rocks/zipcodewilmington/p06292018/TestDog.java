package rocks.zipcodewilmington.p06292018;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 6/29/18.
 */
public class TestDog {
    @Test
    public void testInheritanceOfAnimal() {
        // Given
        Animal dog = new Dog();
        int expected = 10;

        // When
        dog.walk(expected);

        //Then
        int actual = dog.getTotalDistanceWalked();
        Assert.assertEquals(expected, actual);
    }
}
