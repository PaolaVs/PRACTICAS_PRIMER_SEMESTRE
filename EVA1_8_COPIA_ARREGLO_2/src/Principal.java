
public class Principal {


    public static void main(String[] args) {
      int aiDatos[];
      int aiCopia[];

      aiDatos = new int [10];
      aiCopia = new int [10];
        for(int i = 0; i< aiDatos.length; i++) 
        aiDatos[i] = (int)(Math.random()*100)+1;
        
        //aiCopia = aiDatos;//aqui copiamos dirrecciones
        //ELEMENTO POR ELEMENTO
        for(int i = 0; i< aiDatos.length; i++) 
        aiCopia[i] = aiDatos[i];
    
        
        
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
        System.out.println(aiCopia);    
        System.out.println(aiDatos);
    }
        
        
    

      public static void imprimirArreglo (int[] args){
          System.out.println("");
          for (int i = 0; i < args.length; i++) {
              System.out.println("[" + args[i] + "]");
              
          }
          System.out.println("");
          System.out.println(args);
       
 

// TODO code application logic here
    
    
}
}