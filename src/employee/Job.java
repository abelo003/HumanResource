/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Aula-X
 */
public class Job {
    
    public String title;
    public double minSalary;
    public double maxSalary;
    
    public void getDetails(){
        System.out.println("Title: " + title);
        System.out.println("Min Salary: " + minSalary);
        System.out.println("Max Salary: " + maxSalary);
    }
    
}