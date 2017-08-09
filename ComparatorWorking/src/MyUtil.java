/**
 * Created by badkass on 7/19/2017.
 */
public class MyUtil {
    public static Employee[] sort(Employee[] arr, compare c) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i-1 ; j++) {
                if (c.compare(arr[j],arr[j+1])>0) {
                    swap(arr, j);
                }
            }
        }
        return arr;
    }

    private static void swap(Employee[] arr, int j) {
        Employee temp = arr[j+1];
        arr[j+1] = arr[j];
        arr[j] = temp;
    }

}
