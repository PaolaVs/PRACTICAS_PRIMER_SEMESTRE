/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sovwo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int aCopia[];
       int aDato[];
       aDato = new int[10];
       aCopia = new int[10];
        for (int i = 0; i < aDato.length; i++) {
            aDato[i]= (int)(Math.random() * 100)+1;
          
            
        }
        System.out.println("Datos Originales");
        for (int i = 0; i < aDato.length; i++) {
            System.out.print("[" + aDato[i] + "]");
            
        }
        System.out.println(aDato);
        aCopia = aDato;
        System.out.println("Datos Copia");
        for (int i = 0; i < aCopia.length; i++) {
        System.out.print("[" + aCopia[i] + "]");        
        
           
        }
         System.out.println("");
    
         
           // TODO code application logic here
       }


} 