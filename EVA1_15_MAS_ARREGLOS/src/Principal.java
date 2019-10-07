
public class Principal {

   
    public static void main(String[] args) {
        int iNum = 10;
        System.out.println("Valor = " + iNum);
        incrementa (iNum);
        System.out.println("Valor = " + iNum);
        //--
        Prueba obj = new Prueba();
        obj.iVal = 10;
        System.out.println("Valor = " + obj.iVal);
        incrementaObj(obj);
        System.out.println("Valor = " + obj.iVal);
    }
    public static void incrementa(int iVal){
        iVal++;
        System.out.println("Valor = " + iVal);
        }
    public static void incrementaObj(Prueba obj){
      obj.iVal++;
}

}
class Prueba{
    int iVal;

}