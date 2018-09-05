package rocks.zipcodewilmington.week11.p09042018;

import java.util.stream.Stream;

/**
 * Created by leon on 5/30/17.
 */ // TODO - Demo
// This class demonstrates the transliteration
// between do-while, while, for, for-each, and Stream-forEach syntax
// https://stackoverflow.com/questions/5689830/converting-loops-java-beginner-question
public class FromLoops {

    // This method definition showcases while-loop syntax
    public void whileLoop(String[] strings) {
        int i = 0;
        while (i < strings.length) {
            String currentString = strings[i];
            System.out.println(currentString);
            i++;
        }
    }

    // This method definition showcases for-loop syntax
    public void forLoop(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            System.out.println(currentString);
        }
    }

    // This method definition showcases for-each-loop syntax
    public void forEachLoop(String[] strings) {
        for (String currentString : strings) {
            System.out.println(currentString);
        }
    }

    // This method definition showcases Stream.forEach syntax
    public void streamPrint(String[] strings) {
        Stream.of(strings).forEach(System.out::print);
    }
}

