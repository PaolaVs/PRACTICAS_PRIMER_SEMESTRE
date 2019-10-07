
public class Principal {
    
    public static void main(String[] args) {
        int arreglo[] = new int[10];
        System.out.println(arreglo);
        llenarArreglo(arreglo);
        madrearArreglo(arreglo);
        System.out.println(arreglo);
        imprimirArreglo(arreglo);                      // TODO code application logic here
    }

    public static void llenarArreglo(int[] arre) {
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random() * 100);
            
        }
         System.out.println(arre);
        
    }
    public static void madrearArreglo(int[] arre){
        arre = new int[100];
        System.out.println(arre);
    }

    public static void imprimirArreglo(int[] arre) {
        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random() * 100);
            System.out.print("[" + arre[i] + "]");
            
        }
        System.out.println("");
        
    }
}
