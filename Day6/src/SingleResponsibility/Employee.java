package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
public class Employee {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService(102,"Ramesh", 600000, "020-34638346", "MemberTechical");
        /*SingleResponsibility.HRService.changeDesignation("Manager", employeeService);
        System.out.println(employeeService.getDesignation());
        SingleResponsibility.FinanceService.updateSalary(700000,employeeService);
        System.out.println(employeeService.getSalary());
        System.out.println("Can change project?");
        System.out.println(SingleResponsibility.ManagerService.changeProject("Artificial Intelligence", employeeService));
        */



    }
}
