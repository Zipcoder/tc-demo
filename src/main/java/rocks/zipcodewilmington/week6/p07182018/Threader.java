package rocks.zipcodewilmington.week6.p07182018;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author leon on 7/18/18.
 */

public class Threader implements Runnable {
    int sharedInt = 0;
    Lock sharedLock = new ReentrantLock();

    public void run() {
        sharedLock.lock();
        for(int i = 0; i < 1_000_000; i++) {
            sharedInt = sharedInt + 1;
        }
        sharedLock.unlock();
        System.out.println("THREAD FINISHED -- + " + Thread.currentThread());
    }
}