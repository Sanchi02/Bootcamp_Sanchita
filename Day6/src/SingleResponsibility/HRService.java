package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
public class HRService {

    public static boolean eligibleForPromotion() {
        return true;
    }

    public static boolean changeDesignation(String newDesignation, EmployeeService employeeService) {
        if (eligibleForPromotion()) {
            employeeService.setDesignation(newDesignation);
            return true;
        }
        return false;
    }
}
