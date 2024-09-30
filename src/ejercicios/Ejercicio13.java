package ejercicios;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
           13. Palíndromo de un número
•	        Descripción: Determina si el número a = 1221 es palíndromo, es decir,
            si se lee igual de izquierda a derecha que de derecha a izquierda.
•	        Variables: a = 1221
         */

        int numero = 1221, n = numero, invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero/= 10;
        }

        if (n == invertido) {
            System.out.println(n + " es un palíndromo.");
        } else {
            System.out.println(n + " no es un palíndromo.");
        }
    }
}