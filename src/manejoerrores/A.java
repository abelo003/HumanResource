/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoerrores;

/**
 *
 * @author Aula-X
 */
public class A {
    
    public void hola() throws NumberFormatException{
        throw new NumberFormatException();
    }
    
    public static void main(String[] args) {
        
        for (String string : args) {
            
            int a = Integer.parseInt(string);
            System.out.println("Valor a : " + a);
        }
        
//        A a = new A();
//        try{
//            a.hola();
//        }catch(NumberFormatException as){
//            System.out.println("1");
////            throw new Exception();
//        }
//        catch(Exception aaa){
////            System.out.println("2");
//        }
        
        //Puede ir un try con un finally
        try{
            System.out.println(Integer.parseInt("a"));
        }catch(NumberFormatExcepcionMia mia){
            System.out.println("Mia");
        }
        finally{
            System.out.println("Manejo");
        }
        System.out.println("Finalizaci{on");
    }
    
}
