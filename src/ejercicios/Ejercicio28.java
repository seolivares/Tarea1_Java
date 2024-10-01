package ejercicios;

public class Ejercicio28 {
    public static void main(String[] args) {
        /*
           28. Calcular el máximo común divisor (MCD)
•	        Descripción: Dados los números a = 48 y b = 18, calcula su MCD (máximo común divisor).
            El MCD es el número más grande que divide exactamente a ambos números.
•	        Variables: a = 48, b = 18
         */

        // Estoy usando el algoritmo de Euclides

        int a = 48, b = 18, temp = 0;;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("El MCD de 48 y 18 es: " + a);
    }
}
