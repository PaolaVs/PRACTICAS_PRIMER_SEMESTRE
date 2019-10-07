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
      Prueba[] apArreglo = new Prueba[5];//GUARDAR 5 OBJETOS DE TIPO DE PRUEBA(CLASE)
        System.out.println(apArreglo);
        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo[i] = new Prueba(); //CREANDO OBJETO DE TIPO PRUEBA
            System.out.println(apArreglo[i]);//IMPRIME 5 DIRRECIONES
            
        }
// TODO code application logic here
    }
    
}
class Prueba{}