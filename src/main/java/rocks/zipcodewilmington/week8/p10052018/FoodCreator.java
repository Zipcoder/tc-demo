package rocks.zipcodewilmington.week8.p10052018;

/**
 * @author leon on 05/10/2018.
 */
public class FoodCreator {

    public Pizza createPizza() {
        sleep(25, "pizza");
        return new Pizza();
    }

    public Burger createBurger() {
        sleep(40, "burger");
        return new Burger();
    }


    private void sleep(long minutes, String mealName) {
        System.out.println("Preparing a meal of " + mealName);
        System.out.println("Timer has been set to " + minutes*100 + " minutes");
        try {
            Thread.sleep(minutes);
        } catch (InterruptedException e) {
            throw new Error(e);
        }
        System.out.println("A meal of " + mealName + " has been prepared!");
    }
}
