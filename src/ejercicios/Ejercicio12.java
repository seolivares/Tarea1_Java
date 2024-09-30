package ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
           12. Inversión de un número
•	        Descripción: Dado el número a = 54321, invierte el orden de sus dígitos. El resultado sería 12345.
•	        Variables: a = 54321
         */

        int numero = 54321, n = numero;
        int invertido = 0;

        while (n != 0) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
            n/= 10;
        }

        System.out.println("El número invertido de " + numero + " es: " + invertido);
    }
}
