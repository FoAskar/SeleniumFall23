import com.fall23.entity.Employee;
import com.fall23.ui.data.JavaFaker;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.helper.Constants;
import com.fall23.ui.pages.WebTablePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.List;

import static com.fall23.entity.Employee.getEmployeesFromTable;

public class EmployeesTableTest {



    @Test
    void test123(){
        WebDriver driver = Driver.getDriver();
        driver.get(Constants.WT_URL);
        Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();

        WebTablePage webTablePage = new WebTablePage();
        webTablePage.fillUpTheForm(randomEmployee);


        List<Employee> employees = getEmployeesFromTable(driver);

        employees.forEach(System.out::println);

        int totalSalaryAmount = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        int total = 0;
        for (Employee employee:employees){
            total+= employee.getSalary();
        }

        System.out.println(totalSalaryAmount);
        System.out.println(total + " total");
    }
}

