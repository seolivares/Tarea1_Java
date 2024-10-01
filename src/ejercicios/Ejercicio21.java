package ejercicios;

public class Ejercicio21 {
    public static void main(String[] args) {
        /*
            21. Raíz cuadrada sin usar librerías
•	        Descripción: Calcula la raíz cuadrada del número a = 49 sin usar funciones predefinidas.
            La raíz cuadrada de 49 es 7.
•	        Variables: a = 49
         */

        // Estoy usando el Método de Newton

        double a = 49, precision = 0.00001, estimacion = a / 2;

        while ((estimacion * estimacion - a) > precision || (a - estimacion * estimacion) > precision) {
            estimacion = (estimacion + (a / estimacion)) / 2;
        }

        System.out.println("La raíz cuadrada de " + a + " es: " + estimacion);
    }
}
