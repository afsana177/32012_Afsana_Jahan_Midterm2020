package design;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingEmployeeInfo {
    private EmployeeInfo employeeInfo;

    @BeforeTest
    public void initTest() {

        employeeInfo = new EmployeeInfo();
        employeeInfo.setEmployeeName("Afsana Jahan");
        employeeInfo.setEmployeeId(30132);
        employeeInfo.assignDepartment("Human Resources");
        EmployeeInfo.setCompanyName("Google");
        employeeInfo.setEmployeeSalary(150000);
    }

    @Test
    public void testEmployeeName() {
        System.out.println("Testing employeeName()");
        assertEquals("Afsana Jahan", employeeInfo.employeeName());
    }

    @Test
    public void testEmployeeId() {

        System.out.println("Testing employeeId()");
        assertEquals(30132, employeeInfo.employeeId());
    }

    @Test
    public void testEmployeeDepartment() {

        System.out.println("Testing getEmployeeDepartment()");
        assertEquals("Human Resources", employeeInfo.getEmployeeDepartment());
    }

    @Test
    public void testCompanyName() {

        System.out.println("Testing setCompanyName()");
        assertEquals("Google", employeeInfo.getCompanyName());
    }

    @Test
    public void testCalculateSalary() {

        System.out.println("Testing calculateSalary()");
        assertEquals(150000, employeeInfo.calculateSalary());
    }
}