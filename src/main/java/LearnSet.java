import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class LearnSet {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Soumya"));
        employees.add(new Employee(2, "Shubham"));
        employees.add(new Employee(3, "Raj"));
        employees.add(new Employee(2, "Rahul"));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
