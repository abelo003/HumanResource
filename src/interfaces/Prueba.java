/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Aula-X
 */
public class Prueba implements TestInterface, TestInterface2{

    @Override
    public void hola() {
        System.out.println(valor);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nada() {
        System.out.println(valor2);
    }
    
    public static void main(String[] args) {
        Prueba p = new Prueba();
        
    }
    
}
