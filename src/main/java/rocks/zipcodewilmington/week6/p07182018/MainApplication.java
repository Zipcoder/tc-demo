package rocks.zipcodewilmington.week6.p07182018;

/**
 * @author leon on 7/18/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        testThreader();
    }

    public static void testThreader() {
        Threader threader = new Threader();
        Thread first = new Thread(threader);
        Thread second = new Thread(threader);

        first.start();
        second.start();

        WaitUtility.sleep(500);

        System.out.println(threader.sharedInt);
    }

    public static void testJogger() {
        Thread runner1 = new Thread(new Jogger("Runner1"));
        Thread runner2 = new Thread(new Jogger("Runner2"));

        runner1.start();
        runner1.interrupt();
        runner2.start();
    }
}
