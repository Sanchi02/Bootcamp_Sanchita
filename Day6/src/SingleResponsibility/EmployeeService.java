package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
public class EmployeeService {
    private int empID;
    private String name;
    private double salary;
    private String phone;
    private String designation;

    public EmployeeService(int empID, String name, double salary, String phone, String designation) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.designation = designation;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}
