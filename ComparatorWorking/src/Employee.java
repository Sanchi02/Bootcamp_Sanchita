import java.util.Date;

/**
 * Created by badkass on 7/18/2017.
 */
enum location {
    HYD,PUN;
}

public class Employee {
    private int empID;
    private int age;
    String name;
    String lastName;
    String dateOfBirth;
    private Date dateOfJoining = new Date();
    private String department;
    private location location;

    public Employee(int empID, int age, String name, String lastName, String dateOfBirth, Date dateOfJoining, String department, location location) {
        this.empID = empID;
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", department='" + department + '\'' +
                ", location=" + location +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee() {
    }


    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

}
