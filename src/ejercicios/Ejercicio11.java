package ejercicios;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
           11. Fibonacci
•	        Descripción: Genera los primeros N = 10 números de la secuencia de Fibonacci,
            donde cada número es la suma de los dos anteriores.
            La secuencia comienza con 0 y 1.
•	        Variables: N = 10
         */

        int N = 10, a = 0, b = 1;

        System.out.println("Los primeros " + N + " números de la secuencia de Fibonacci son: ");
        System.out.print("[ ");

        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.print("]");
    }
}
