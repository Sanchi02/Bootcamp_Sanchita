import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by badkass on 8/1/2017.
 */
/*1) Write a program using concurrent APIs so that one thread can
   produce some random integer data and other thread can read it
   from the same collection and display it on the console.
*/
public class RandomInteger implements Runnable{
    Thread thread1 = null;
    Thread thread2 = null;
    BlockingQueue<Double> numbers = new LinkedBlockingDeque<>();

    public static void main(String[] args) throws Exception{
        new RandomInteger();
        System.out.println("Finish");
    }

    public RandomInteger() {
        thread1 = new Thread(this);
        thread2 = new Thread(this);
        thread1.start();
        thread2.start();
    }

    public void run() {

        if (Thread.currentThread() == thread1) {
            for (int i = 0; i < 500; i++) {
                // System.out.println("Random number generated!!");
                try {
                    numbers.put(Math.random());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (Thread.currentThread() == thread2) {
            //    System.out.println("Random number printed!!");
            while (!numbers.isEmpty()) {
                try {
                    System.out.println(numbers.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



