
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARACION
     int aDatos[], a, b;
     int[] aDatos2, x, y;
     int aCopia[];
     
     //INICIO DEL ARREGLO
     int z = 100;
     aDatos = new int[z];
        for (int i = 0; i < aDatos.length; i++) {
         aDatos[i] = (int)(Math.random()* 100) + 1; //VALORES RANDOM DEL 1 AL 100
         
            
        }
        //SON OBJETOS
        //LA MEMORIA ES CONSECUTIVA
        aDatos[4] = 5000;
        aDatos[69] = 500;
        }
// TODO code application logic here
    }
    

