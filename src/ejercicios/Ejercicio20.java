package ejercicios;

public class Ejercicio20 {
    public static void main(String[] args) {
        /*
           20. Número Armstrong
•	        Descripción: Determina si el número a = 153 es un número Armstrong.
            Un número Armstrong es igual a la suma de sus dígitos elevados a la potencia del número de dígitos.
            Para 153, sería  1^3 * 5^3 * 3^3 = 153
•	        Variables: a = 153
         */

        int a = 153, temp = a, suma = 0, numero = a, digitos = 0;

        while (temp > 0) {
            temp /= 10;
            digitos++;
        }

        while (a > 0) {
            int digito = a % 10;
            suma += Math.pow(digito, digitos);
            a /= 10;
        }

        if (suma == numero) {
            System.out.println(numero + " es un número Armstrong.");
        } else {
            System.out.println(numero + " no es un número Armstrong.");
        }
    }
}
