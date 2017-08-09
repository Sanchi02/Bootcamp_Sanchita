/**
 * Created by badkass on 7/19/2017.
 */
public class CompareID implements compare {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return compare(e1.getEmpID(),e2.getEmpID());
    }
}
