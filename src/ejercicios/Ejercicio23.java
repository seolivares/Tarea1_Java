package ejercicios;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*
           23. Divisibilidad
•	        Descripción: Dado el número a = 45, determina si es divisible por 2, 3 o 5.
            Un número es divisible por otro si al dividir el resultado es un número entero sin resto.
•	        Variables: a = 45
         */

        int a = 45;

        System.out.print("El número " + a);

        if (a % 2 == 0) {
            System.out.println();
            System.out.println(" es divisible por: 2");
        }

        if (a % 3 == 0) {
            System.out.println();
            System.out.println(" es divisible por: 3");
        }

        if (a % 5 == 0) {
            System.out.println();
            System.out.println(" es divisible por: 5");
        }

        if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0) {
            System.out.println(" no es divisible por los números 2, 3 o 5.");
        }
    }
}
