/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracciones;

/**
 *
 * @author Aula-X
 */
public class HijoClaseAbstracta extends ClaseAbstracta{

    @Override
    public void abstraccion() {
        super.saluda();
    }
    
    public static void main(String[] args) {
        ClaseAbstracta hijo = new HijoClaseAbstracta();
        hijo.abstraccion();
    }
    
}
