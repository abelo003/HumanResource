/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.animals;

/**
 *
 * @author Aula-X
 */
public class Perro extends Animal{
    
    @Override
    public void comer(){
        System.out.println("Tortilla");
    }
    
    @Override
    public void ruido(){
        System.out.println("Guao guao");
    }
    
    public void propioPerro(){
        System.out.println("Propio de perro...");
    }
    
}
