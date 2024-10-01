package ejercicios;

public class Ejercicio27 {
    public static void main(String[] args) {
        /*
           27. Intercambio de valores
•	        Descripción: Intercambia los valores de a = 5 y b = 10 sin usar una tercera variable auxiliar.
•	        Variables: a = 5, b = 10
         */

        int a = 5, b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
