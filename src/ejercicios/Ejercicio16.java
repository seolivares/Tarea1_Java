package ejercicios;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
           16. Sumar dígitos de un número
•	        Descripción: Dado el número a = 5678, suma todos sus dígitos.
            El resultado sería 5 + 6 + 7 + 8 = 26.
•	        Variables: a = 5678
         */

        int numero = 5678, n = numero, suma = 0;

        while (n > 0) {
            int digito = n % 10;
            suma += digito;
            n/= 10;
        }

        System.out.println("La suma de los dígitos del numero " + numero + " es: " + suma);
    }
}
