package ejercicios;

public class Ejercicio6 {

    public static void main(String[] args) {
        /*
            6. Promedio de tres números
•	        Descripción: Dados los números a = 4, b = 9 y c = 13, calcula el promedio de los tres.
•	        Variables: a = 4, b = 9, c = 13
         */

        float a = 4, b = 9, c = 13;
        float promedio = 0;

        promedio = (a+b+c)/3;

        System.out.println("El promedio de (" + a + ", " + b + " y " + c + ") es: " + promedio);
    }
}