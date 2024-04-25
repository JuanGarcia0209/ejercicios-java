import java.util.Scanner;

public class Ejercicio106 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int m = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n = entrada.nextInt();

        int mcd = encontrarMCD(m, n);
        System.out.println("El máximo común divisor de " + m + " y " + n + " es: " + mcd);
    }

    public static int encontrarMCD(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            int resul =encontrarMCD(n, m % n);
            return resul;
        }
    }
}
