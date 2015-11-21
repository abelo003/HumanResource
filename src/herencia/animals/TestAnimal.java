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
        //Cualquier objeto de la clase Animal puede ser perro o gato
        Animal gato;
        Animal perro;
        
        gato = new Gato();
        perro = new Perro();
        
        gato.valor = 25;
        System.out.println("Referencia gato: " + gato);
        instanciaDe(perro);
        instanciaDe(gato);
        System.out.println("Referencia de Gato: " + gato + " valor " + gato.valor);
        
    }
    
    public static void instanciaDe(Animal animal){
        if(animal instanceof Perro){
            ((Perro)animal).propioPerro();
        }
        else if(animal instanceof Gato){
            System.out.println("Refrencia de Animal: " + animal + " valor " + animal.valor);
            animal.valor = 28;
            Gato g = ((Gato)animal);
            g.propioGato();
            System.out.println("Referencia de Gato: " + g + " valor " + g.valor);
        }
        //Metodo generico
//        animal.comer();
//        animal.ruido();
    }
}
