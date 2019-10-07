/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 10;//SE VA AL STACK
       Principal pObj = new Principal();//LLAMADA FUNCION(SE VA AL STACK)
        System.out.println(i);
        System.out.println(pObj);
        pObj = null; //NOS DESHACEMOS DE LA MEMORIA USADA
              // TODO code application logic here
    }
    
}
