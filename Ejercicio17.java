import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite el primer número: ");
        n1 = scanner.nextInt();

        System.out.print("Digite el segundo número: ");
        n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("El primer número es el mayor.");
        } else {
            System.out.println("El segundo número es el mayor.");   
        }
    }
}
