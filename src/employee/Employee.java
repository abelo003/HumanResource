/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Date;

/**
 *
 * @author Aula-X
 */
public class Employee {
    
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public String phoneNumber;
    public double salary;
    public Date hireDate;
    public Department department;
    
    public void getDetails(){
        System.out.println("Id: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
    }
    
}
