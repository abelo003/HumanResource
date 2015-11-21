/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.animals;

/**
 *
 * @author Aula-X
 */
public class Gato extends Animal{

    @Override
    public void comer() {
        System.out.println("Atun");
    }

    @Override
    public void ruido() {
        super.ruido();
        System.out.println("Miau");
    }
    
    public void ruido(String a){
        System.out.println(a);
    }
    
    public void propioGato(){
        System.out.println("Propio de gato");
    }
    
    public String a(){
        return "";
    }
    
//    public int a(){
//        
//    }
    
}
