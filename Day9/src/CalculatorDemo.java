/**
 * Created by badkass on 7/28/2017.
 */
public class CalculatorDemo {
    public static void main(String[] args) {

        CalculatorService.calculateMethod((int val1, int val2) -> {
            return Math.addExact(val1,val2);
        });


      /*  CalculatorService.calculateMethod((int val1, int val2) -> {
            return Math.sin(val1);
        });

        CalculatorService.calculateMethod( (int val1, int val2) -> {
            System.out.printf("Result is: %s%n", (val1 * val2));
        });

        CalculatorService.calculateMethod((int val1, int val2) -> {
            System.out.printf("Result is: %s%n", (val1 / val2));
        });*/


    }
}
