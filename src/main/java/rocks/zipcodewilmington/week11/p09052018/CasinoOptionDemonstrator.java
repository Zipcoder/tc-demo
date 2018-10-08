package rocks.zipcodewilmington.week11.p09052018;

import java.util.Scanner;

/**
 * @author leon on 9/5/18.
 */
public class CasinoOptionDemonstrator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();
        CasinoOption co = CasinoOption.getClientEnumeration(userInput);
        co.perform();
    }

    public static void main1(String[] args) {
        StringEnumOption.HELLOWORLD.printEnumString();
    }
}
