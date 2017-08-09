package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
public class FinanceService {
    public static boolean updateSalary(double salary, EmployeeService employeeService) {
        if (HRService.eligibleForPromotion()){
            employeeService.setSalary(salary);
            return true;
         } else {
            return false;
        }
    }

    public static double calculateTDS(double salary) {
        double tds = 0.02 * salary;
        return tds;
    }



}
