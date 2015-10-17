/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Aula-X
 */
public class Location {
    
    public String streetAddress;
    public int postalCode;
    public String city;
    public String stateProvince;
    public String country;
    
    public void getDetails(){
        System.out.println("Street Address: " + streetAddress);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("City: " + city);
        System.out.println("State Province: " + stateProvince);
        System.out.println("Country: " + country);
    }
    
}
