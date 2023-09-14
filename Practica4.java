
package practica4;
import java.util.Scanner;
/**
 *
 * @author Zuriel
 */
public class Practica4 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingresa tu cantidad en pesos mexicanos ");
        int CantidadPesos = scanner.nextInt();
        
        scanner.nextLine();
        
      final double  Dolar = 17.13;
       final double Euro = 18.29;
       
      double dolar = CantidadPesos/Dolar;
      double euro = CantidadPesos/Euro;
      
      scanner.close();
      
        System.out.println("Tu cantidad en dolares es: " + dolar + " y en euros es: " + euro);
        
        
      
        
        
        
        
    
    }
    
}
