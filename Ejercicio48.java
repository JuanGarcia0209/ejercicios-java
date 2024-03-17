import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite el primer número: ");
        n1 = scanner.nextInt();

        System.out.print("Digite el segundo número: ");
        n2 = scanner.nextInt();

        System.out.println("Suma: " + (n1 + n2));
        System.out.println("Resta: " + (n1 - n2));
        System.out.println("Multiplicación: " + (n1 * n2));
        System.out.println("División: " + (n1 / n2));
        System.out.println("Módulo: " + (n1 % n2));
    }
}
