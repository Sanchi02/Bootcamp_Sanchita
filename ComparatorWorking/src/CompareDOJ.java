/**
 * Created by badkass on 7/19/2017.
 */
public class CompareDOJ implements compare {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.getDateOfJoining().compareTo(e2.getDateOfJoining());
        return 0;
    }
}
