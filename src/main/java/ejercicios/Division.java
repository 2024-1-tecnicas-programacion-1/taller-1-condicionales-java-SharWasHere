
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

public class Division {
    public static String evaluar(int dividendo, int divisor) {
        // TODO: Coloca aquí el código del ejercicio 3: Division
        if(dividendo%divisor!=0){
            return "La división no es exacta."
            
        }
    
        
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividendo = lector.nextInt();
        System.out.print("Divisor:");
        int divisor = lector.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
    }
}
