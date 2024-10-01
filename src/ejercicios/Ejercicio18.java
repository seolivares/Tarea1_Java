package ejercicios;

public class Ejercicio18 {
    public static void main(String[] args) {
        /*
           18. Calcular potencia
•	        Descripción: Dado el número a = 2 y la potencia b = 8,
            calcula a^b, es decir, 2 elevado a la potencia de 8.
        •	Variables: a = 2, b = 8
         */

        int a = 2, b = 8, resultado = 1;

        for (int i = 0; i < b; i++) {
            resultado *= a;
        }

        System.out.println(a + " elevado a " + b + " es: " + resultado);
    }
}
