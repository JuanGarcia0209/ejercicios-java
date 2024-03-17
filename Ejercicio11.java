import java.util.Scanner;

public class Ejercicio11 {
    static Scanner scanner = new Scanner(System.in);
    static double a, b, h;
    public static void main(String[] args) {
        System.out.print("Digite la base del rectángulo: ");
        b = scanner.nextDouble();

        System.out.print("Digite la altura del rectángulo: ");
        h = scanner.nextDouble();

        a = b * h ;

        System.out.println("El área del rectángulo es de: " + a);
    }
}
