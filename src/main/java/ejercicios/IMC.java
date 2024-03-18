package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

public class IMC {

    public static String evaluar(int peso, double estatura, int edad) {
        // TODO: Coloca aquí el código del ejercicio 8: Índice de masa corporal
        double imc = peso / Math.pow(estatura, 2);

        if (peso < 0) {
            return "ingrese un número de peso válido";
        } else if (imc < 22.0 && edad < 45) {
            return "bajo";
        } else if (imc < 22.0 && edad >= 45) {
            return "medio";
        } else if (imc >= 22.0 && edad < 45) {
            return "medio";
        } else {

            return "alto";
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();

        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
