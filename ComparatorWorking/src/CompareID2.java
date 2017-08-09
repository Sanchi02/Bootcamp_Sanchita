import java.util.Comparator;

/**
 * Created by badkass on 7/20/2017.
 */
public class CompareID2 implements Comparator<Employee>{
    @Override

    public int compare(Employee o1, Employee o2) {
        return o1.getEmpID()-o2.getEmpID();
    }
}
