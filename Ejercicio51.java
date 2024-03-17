import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b, h;

        System.out.print("Digite la base del rectángulo: ");
        b = scanner.nextDouble();

        System.out.print("Digite la altura del rectángulo: ");
        h = scanner.nextDouble();

        System.out.println("El área del rectángulo es " + (b * h));
        System.out.println("El perímetro del rectángulo es " + (2 * (b + h)));
    }
}
