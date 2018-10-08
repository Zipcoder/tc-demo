package rocks.zipcodewilmington.week11.p09052018;

/**
 * @author leon on 9/5/18.
 */
public enum CasinoOption {
    BLACKJACK(() -> {
        System.out.println("Creating a new game of blackjack...");
        Object blackJackGame = new Object();
        System.out.println("Black jack game has been created");

        System.out.println("Beginnning black jack game");
    }),

    GOFISH(() -> {
        System.out.println("Creating a new game of Go Fish...");
        Object blackJackGame = new Object();
        System.out.println("Go Fish game has been created");

        System.out.println("Beginnning Go Fish game");

    });


    private final Runnable r;

    CasinoOption(Runnable r) {
        this.r = r;
    }

    public void perform() {
        r.run();
    }

    public static CasinoOption getClientEnumeration(String userInput) {
        // todo - some userinput sanitization
        return CasinoOption.valueOf(userInput);
    }
}
