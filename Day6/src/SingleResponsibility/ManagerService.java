package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
public class ManagerService {

    public static boolean changeProject(String project, EmployeeService employeeService) {
        if (employeeService.getDesignation().equals("Manager"))
            return true;
        return false;
    }


}
