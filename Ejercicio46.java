import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m;

        System.out.print("Digite la distancia en millas: ");
        m = scanner.nextDouble();

        System.out.println(m + " millas equivalen a " + (m * 1852) + " metros");
    }
}
