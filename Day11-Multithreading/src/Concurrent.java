import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by badkass on 8/1/2017.
 */

public class Concurrent {
    public static void main(String[] args) {
            Sum sum = new Sum();
            Executor executor = Executors.newCachedThreadPool();
            for (int i = 0; i < 5000; i++) {
                executor.execute(sum);
            }
        }
    }

class Sum implements Runnable {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 500; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}