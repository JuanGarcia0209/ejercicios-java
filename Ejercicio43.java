import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite el primer número: ");
        n1 = scanner.nextInt();

        System.out.print("Digite el segundo número: ");
        n2 = scanner.nextInt();

        if (n1 < n2) {
            System.out.println("El número menor es " + n1);
        } else {
            System.out.println("El número menor es " + n2);
        }
    }
}
