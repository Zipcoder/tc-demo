package rocks.zipcodewilmington.week8.p10052018;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 05/10/2018.
 */
public class MealCookingTimerTest {
    private MealCookingTimer timer;

    @Before
    public void setup() {
        this.timer = new MealCookingTimer();
    }

    @Test
    public void timeBurgerCookingTest() {
        // given
        long expected = 4000L;

        // when
        long actual= timer.getBurgerCookTime();

        // then
        Assert.assertEquals(expected, actual);
    }
}
