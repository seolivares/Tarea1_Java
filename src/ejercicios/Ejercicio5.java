package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
            5. Máximo de tres números
•	        Descripción: Dados los números a = 5, b = 12 y c = 9, encuentra cuál de ellos es el mayor.
•	        Variables: a = 5, b = 12, c = 9
         */

        int a = 5, b = 12, c = 9, mayor = 0;

        mayor = a;

        if(b > mayor){
            mayor = b;
        }

        if(c > mayor){
            mayor = c;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
