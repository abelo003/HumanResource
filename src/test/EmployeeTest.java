/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import employee.Employee;
import java.util.Date;

/**
 *
 * @author Aula-X
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getDetails();
        employee.id = 19;
        employee.firstName = "Abel";
        employee.lastName = "Cruz";
        employee.age = 24;
        employee.email = "abel.cruz@ok.com";
        employee.phoneNumber = "4587845211";
        employee.salary = 300.20;
        employee.hireDate = new Date(2015, 11, 25);
        System.out.println("----------------------------");
        employee.getDetails();
                
    }

}
