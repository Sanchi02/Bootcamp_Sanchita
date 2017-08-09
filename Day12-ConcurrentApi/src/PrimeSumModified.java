import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by badkass on 8/2/2017.
 */
public class PrimeSumModified {
    public static void main(String[] args) {
        Future<Integer> future[] = new Future[5];
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        int lowerbound = 0;
        int upperbound = 100;
        for (int i = 0; i < 5; i++) {
            future[i] = executorService1.submit(new PrimeNumberGenerator(lowerbound, upperbound));
            lowerbound += 100;
            upperbound += 100;
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            try {
                sum += future[i].get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum);

    }
}