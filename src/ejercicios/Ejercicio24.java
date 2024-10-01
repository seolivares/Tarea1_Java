package ejercicios;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
           24. Sumar los múltiplos de un número en un rango
•	        Descripción: Suma todos los múltiplos de a = 3 dentro del rango de 1 a 50.
            Un múltiplo de un número es el resultado de multiplicarlo por un entero.
•	        Variables: a = 3, rango de 1 a 50
         */

        int a = 3, suma = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % a == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los múltiplos de " + a + " entre 1 y 50 es: " + suma);
    }
}
