import java.io.Serializable;

/**
 * Created by badkass on 7/27/2017.
 */
public class Employee implements Serializable{
    int uid;
    String name;
    transient double salary;
    String location;

    public Employee(int uid, String name, double salary, String location) {
        this.uid = uid;
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
