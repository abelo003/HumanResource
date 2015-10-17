/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo6.stringtest;


/**
 *
 * @author Abel
 */
public class Stringtest {
    
    public static void main(String[] args) {
        String mensaje = "Hola";

        //La primera parte es 11 y laa segunda es 56, el compilador efectua de izquiera a derecha
        // y en encuentra dos numeros y los suma después encuentra un texto y lo concatena, concatena 
        //lo que este a la derecha 
        System.out.println(5 + 6 + " Mensaje: " + mensaje + 5 + 6);
        
        String myString = "Hello";//Es inmutable -- no cambia el valor -- genera otro string
        System.out.println(myString.concat(" World"));
        System.out.println(myString + " --length-- " + myString.length());
        
        String otroString = "Hola Mundo cruel";
        System.out.println("--------------------------------------");
        System.out.println(otroString);
        System.out.println(otroString.substring(5));
        System.out.println(otroString.substring(5,7));
        System.out.println(otroString);
        System.out.println(otroString.endsWith("cruel"));
        System.out.println(otroString.startsWith("Hola"));
    }
    
}
