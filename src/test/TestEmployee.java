/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.sun.xml.internal.bind.v2.model.core.Adapter;
import employee.Department;
import employee.Employee;
import employee.Job;
import employee.Location;
import java.util.Date;

/**
 *
 * @author Abel
 */
public class TestEmployee {
    
    void main(){
        System.out.println("One");
    }
    
    static void main(String arg){
        System.out.println("Two");
    }
    
    public static final void main(String[] args) {
        
        Job jAdministrationManager = new Job();
        jAdministrationManager.maxSalary = 30000;
        jAdministrationManager.minSalary = 15000;
        jAdministrationManager.title = "Administration Manager";
        
        Location lArgentina = new Location();
        lArgentina.city = "Sidney";
        lArgentina.streetAddress = "12-98 Victoria Street";
        lArgentina.postalCode = 2901;
        lArgentina.stateProvince = "New South Wales";
        lArgentina.country = "Argentina";
        
        
        Department dAdministration = new Department();
        dAdministration.name = "Administration";
        dAdministration.location = lArgentina;
        System.out.println("Department details:");
        dAdministration.getDetails();
        
        Employee employee = new Employee();
        employee.id = 1;
        employee.firstName = "Humberto";
        employee.lastName = "Banuelos";
        employee.age = 29;
        employee.email = "hbanuelos@7i.com.mx";
        employee.phoneNumber = "123.456.7890";
        employee.salary = 4500.25;
        
        employee.hireDate = new Date();
        employee.job = jAdministrationManager;
        employee.department = dAdministration;
        
        System.out.println("--------------------------------------");
        System.out.println("\nEmployee details:");
        employee.getDetails();
        Employee employeeTwo = employee;
        employeeTwo.firstName = "George";
        System.out.println("\nEmployee details:");
        employee.getDetails();
        employeeTwo.getDetails();
        
    }
    
    void main(Object[] args){
        System.out.println("Four");
    }
    
}
