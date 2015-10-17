/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Aula-X
 */
public class Department {
    
    public String name;
    public Employee manager;
    public Location location;
    
    public void getDetails(){
        System.out.println("Name: " + name);
        manager.getDetails();
        location.getDetails();
    }
    
}
