package com.fall23.entity;

import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee {

    private String FirstName;
    private String LastName;
    private int age;
    private String email;
    private int salary;
    private String department;

    public static ArrayList<Employee> getEmployeesFromTable(WebDriver driver){
        List<WebElement> rows = driver.findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        ArrayList<Employee> employees = new ArrayList<>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String firstName = cells.get(0).getText();
            String lastName = cells.get(1).getText();
            String ageText = cells.get(2).getText().replaceAll("[^0-9]", "");
            String email = cells.get(3).getText();
            String salaryText = cells.get(4).getText().replaceAll("[^0-9]", "");
            String department = cells.get(5).getText();

            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty() || salaryText.isEmpty() ||department.isEmpty()){
                continue;
            }

            int age = Integer.parseInt(ageText.trim());
            int salary = Integer.parseInt(salaryText.trim());



            employees.add(new Employee(firstName, lastName, age, email, salary, department));
        }
        return employees;
    }

}
