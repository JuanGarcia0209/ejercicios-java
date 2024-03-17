import java.util.Scanner;

public class Ejercicio10 {
    static Scanner scanner = new Scanner(System.in);
    static double a, b, h;
    public static void main(String[] args) {
        System.out.print("Digite la base del triangulo: ");
        b = scanner.nextDouble();

        System.out.print("Digite la altura del triangulo: ");
        h = scanner.nextDouble();

        a = b * h / 2;

        System.out.println("El área del triangulo es de: " + a);
    }
}
