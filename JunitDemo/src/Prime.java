import java.util.Scanner;

/**
 * Created by badkass on 7/17/2017.
 */

public class Prime {
    public static void main(String[] args) {
        //int primesTill = 120;
        Scanner scan = new Scanner(System.in);
        int primesTill = scan.nextInt();

        int[] arr = new int[30];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 11;
        int tracker = 5;
        for(int i = 11; i <= primesTill; i = i+ 2) {
            if (i % 3 == 0)
                continue;
            if (i % 5 == 0)
                continue;
            if (i % 7 == 0)
                continue;
            if (i % 11 == 0)
                continue;
            arr[tracker] = i;
            tracker++;
        }

        for(int i : arr) {
            if(i == 0)
                break;
            else
                System.out.println(i);
        }
    }
}
