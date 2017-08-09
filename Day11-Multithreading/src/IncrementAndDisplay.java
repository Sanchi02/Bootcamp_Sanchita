/**
 * Created by badkass on 7/31/2017.
 */
public class IncrementAndDisplay {
    int i = 0;
    public static void main(String[] args) {
        new IncrementAndDisplay();
        System.out.println("DONE!!!");
    }

    IncrementAndDisplay() {
        for (int count=0; count<20; count++) {
            Thread increment = new Thread(new Runnable() {
                public void run() {
                    i++;
                }
            });
            increment.start();
            Thread display = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(i);
                }
            });
            display.start();
        }


    }
}
