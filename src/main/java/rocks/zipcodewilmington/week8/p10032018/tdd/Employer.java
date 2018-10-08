package rocks.zipcodewilmington.week8.p10032018.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 03/10/2018.
 */
public class Employer {
    List<Employee> employeeList = new ArrayList<>();

    public Employer(EmploymentType management) {

    }

    public void employ(Employee employee) {
        employeeList.add(employee);
    }

    public boolean hasHired(Employee employee) {
        return employeeList.contains(employee);
    }
}
