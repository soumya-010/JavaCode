import java.util.Objects;

public class Employee {
    private int EmployeeId;
    private String name;

    public Employee(int EmployeeId, String name){
        this.EmployeeId = EmployeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [EmployeeId=" + EmployeeId + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Employee employee = (Employee) o;
        return EmployeeId == employee.EmployeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmployeeId);
    }
}
