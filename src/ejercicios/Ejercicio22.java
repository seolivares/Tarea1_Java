package ejercicios;

public class Ejercicio22 {
    public static void main(String[] args) {
        /*
           22. Conteo de dígitos de un número
•	        Descripción: Cuenta cuántos dígitos tiene el número a = 987654. El resultado sería 6 dígitos.
•	        Variables: a = 987654
         */

        int a = 987654, numero = a, digitos = 0;

        while(a > 0){
            a /= 10;
            digitos += 1;
        }

        System.out.println("La cantidad de dígitos de " + numero + " es:" + digitos);
    }
}
