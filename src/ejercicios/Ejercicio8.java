package ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
           8. Conversión de temperatura
•	        Descripción: Dado que la temperatura es c = 25 grados Celsius, conviértela a Fahrenheit usando la fórmula:
            F = 9/5 * C + 32
•	        Variables: c = 25
         */

        double celsius = 25;
        double fahrenheit = (9.0/5) * celsius + 32;

        System.out.println("La temperatura en Fahrenheit de " + celsius + "°C es: " + fahrenheit + "°F");
    }
}
