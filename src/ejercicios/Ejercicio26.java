package ejercicios;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*
           26. Valor absoluto
•	        Descripción: Determina el valor absoluto del número a = -15.
            El valor absoluto es la distancia de un número al 0, ignorando su signo.
•	        Variables: a = -15
         */

        int a = -15, valorAbsoluto;

        // Calcular el valor absoluto
        if (a < 0) {
            valorAbsoluto = -a; // Hacerlo positivo
        } else {
            valorAbsoluto = a; // Ya es positivo
        }

        System.out.println("El valor absoluto de " + a + " es: " + valorAbsoluto);
    }
}
