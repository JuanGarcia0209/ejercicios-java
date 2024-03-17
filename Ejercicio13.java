import java.util.Scanner;

public class Ejercicio13 {
    static Scanner scanner = new Scanner(System.in);
    static int n[] = new int[3], r[] = new int[3];
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite un número: ");
            n[i] = scanner.nextInt();
            r[i] = n[i] % 10;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Ultimo dígito del número " + n[i] + " es: " + r[i]);
        }
    }
}
