package ejercicios;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
           15. Calcular el área de un círculo
•	        Descripción: Dado el radio r = 7 de un círculo, calcula su área usando la fórmula:
            Area = π * r^2
•	        Variables: r = 7
         */

        double r = 7;
        double area = Math.PI * r * r;

        System.out.println("El área del círculo con radio " + r + " es: " + area);
    }
}
