package ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
           4. Números primos
•	       Descripción: Dado el número a = 29, determina si es primo. Un número primo solo tiene dos divisores: 1 y él mismo.
•	       Variables: a = 29
         */

        int a = 29;
        boolean primo = true;

        if (a <= 1) {
            primo = false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                primo = false;
            }
        }

        if(primo){
            System.out.println("El número " + a + " es primo");
        }
            else{
                System.out.println("El número " + a + " NO es primo");
            }
    }
}