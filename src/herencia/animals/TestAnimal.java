/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.animals;

/**
 *
 * @author Aula-X
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal gato;
        Animal perro;
        
        gato = new Gato();
        perro = new Perro();
        
        gato.ruido();
        perro.ruido();
    }
}
