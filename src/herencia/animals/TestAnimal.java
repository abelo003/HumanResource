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
//        Animal animal = new Animal();
        Animal gato;
        Animal perro;
        
        gato = new Gato();
        perro = new Perro();
        
        instanciaDe(perro);
        instanciaDe(gato);
        
    }
    
    public static void instanciaDe(Animal animal){
        if(animal instanceof Perro){
            ((Perro)animal).propioPerro();
        }
        else if(animal instanceof Gato){
            ((Gato)animal).propioGato();
        }
        animal.comer();
        animal.ruido();
    }
}
