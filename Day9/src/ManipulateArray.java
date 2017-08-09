import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by badkass on 7/29/2017.
 */
@FunctionalInterface
interface ManipulateArray {
    public void mutateArray(BiFunction<Integer,Integer,Integer> bifunction);
}
