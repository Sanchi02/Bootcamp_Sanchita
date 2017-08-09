import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by badkass on 7/17/2017.
 */
public class PrimeRefined {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primesTill = scan.nextInt();
        calculatePrime(primesTill);
    }

    public static List<Integer> calculatePrime(int primesTill) {
        int sum = 0;
        if (primesTill < 5) {
            System.out.println("Please enter a number greater than 5");
            System.exit(0);
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(5);

        boolean flag = false;
        for (int i = 7; i < primesTill; i = i + 2) {
            flag=false;
            for (int j = 1; j < Math.sqrt(i); j++) {
                if (i % (int)arr.get(j) == 0) {
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                arr.add(i);
            }
        }
        for (Integer i : arr) {
            System.out.println(i);
            sum +=i;
        }
        System.out.println(sum);
        return arr;
    }
}