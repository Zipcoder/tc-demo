package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.week8.p10032018.tdd.Department;
import rocks.zipcodewilmington.week8.p10032018.tdd.Employee;
import rocks.zipcodewilmington.week8.p10032018.tdd.Employer;
import rocks.zipcodewilmington.week8.p10032018.tdd.EmploymentType;

/**
 * @author leon on 03/10/2018.
 */
public class SomeTest {
    // the test should be no longer than it takes to express it verbally
    // - Froilan



    @Test
    public void testThatManagementCanEmployHRDepartment() {
        // Given
        Employer employer = new Employer(EmploymentType.Management);

        // when
        Employee employee = new Employee(Department.HR);
        employer.employ(employee);

        // then
        Assert.assertTrue(employer.hasHired(employee));
    }
}
