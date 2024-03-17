import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el lado del cuadrado: ");

        System.out.println("El área del cuadrado es: " + (Math.pow(scanner.nextDouble(), 2)));
    }
}
