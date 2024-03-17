import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite un número: ");
        n = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
