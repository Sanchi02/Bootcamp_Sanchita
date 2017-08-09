import java.util.Iterator;
import java.util.concurrent.*;
import static org.apache.commons.math3.primes.Primes.isPrime;

/**
 * Created by badkass on 8/1/2017.
 */
/*
 Write a program which will generate prime numbers in the range of
         1-100,101-200,201-300,301-400,401-500 and do the sum of prime
         numbers and the collect the sum of all these variations and do
final total before displaying.

        Every prime number range will be handled by different task so
        total task are 5.*/
public class PrimeGenerator {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future1 = executorService.submit(new PrimeNumberGenerator(0,100));
        Future<Integer> future2 = executorService.submit(new PrimeNumberGenerator(100,200));
        Future<Integer> future3 = executorService.submit(new PrimeNumberGenerator(200,300));
        Future<Integer> future4 = executorService.submit(new PrimeNumberGenerator(300,400));
        Future<Integer> future5 = executorService.submit(new PrimeNumberGenerator(400,500));
        try {
            int result = future1.get()+future2.get()+future3.get()+future4.get()+future5.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class PrimeNumberGenerator implements Callable<Integer>{
        int lowerBound = 0;
        int upperBound = 0;
        PrimeNumberGenerator(int lowerBound, int upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
        public Integer call(){
            int sum = 0;
            for(int i=lowerBound+1; i<=upperBound; i++) {
                if (isPrime(i)) {
                sum = sum + i;
            }
        }
            return sum;
    }
}
