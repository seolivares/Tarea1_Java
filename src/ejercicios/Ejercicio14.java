package ejercicios;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
           14. Conversión de decimal a binario
•	        Descripción: Dado el número decimal a = 45, conviértelo a binario.
•	        Variables: a = 45
         */

        int a = 45;
        String binario = "";

        while (a > 0) {
            int residuo = a % 2;
            binario = residuo + binario;
            a /= 2;
        }

        System.out.println("El número binario es: " + binario);
    }
}
