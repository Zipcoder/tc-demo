package rocks.zipcodewilmington.week8.p10052018;

import rocks.zipcodewilmington.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author leon on 05/10/2018.
 */
public class MealCookingTimer {
    FoodCreator foodCreator = new FoodCreator();

    Person thePerson = new Person();


    public long getPizzaCookTimeLambda() {
        Supplier<Food> foodSupplier = () -> {
            Pizza p = new Pizza();
            p.addTopping(
                    new TomatoSauce(),
                    new TomatoSauce(),
                    new TomatoSauce(),
                    new TomatoSauce());
            return p;
        };


        Consumer<Food> foodConsumer = (food) -> System.out.println(food.toString());
        Consumer<Food> otherFoodConsumer = (food) -> System.out.println("Hello World");
        return timeCook(foodSupplier);
    }


    public void usingConsumer() {
        List<String> stringList = Arrays.asList("The", "quick", "brown", "fox");
        stringList.forEach(System.out::print);
    }


    public void usingBiConsumer() {
        List<String> stringList = Arrays.asList("The", "quick", "brown", "fox");
        BiConsumer<String, String> stringConsumer = (String someString1, String someString2) -> System.out.println(someString1);
        stringList.forEach(string -> stringConsumer.accept(string, ""));
    }

    public long getPizzaCookTime() {
        return timeCook(foodCreator::createPizza);
    }

    public long getBurgerCookTime() {
        Supplier<Food> foodSupplier = foodCreator::createBurger;
        long cookingDuration = timeCook(foodSupplier);
        return cookingDuration;
    }


    public long timeCook(Supplier<Food> method) {
        long startTime = System.currentTimeMillis();
        Food food = method.get();
        long endTime = System.currentTimeMillis();
        long cookingDuration = endTime - startTime;
        return cookingDuration;
    }
}
