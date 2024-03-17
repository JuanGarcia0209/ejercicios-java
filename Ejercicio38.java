import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        double manzanas;

        System.out.print("Digite la edad de la persona: ");
        edad = scanner.nextInt();

        System.out.println("La persona ha consumido " + (edad * 8) + " kilogramos de fruta. Lo cual equivale a " + (8 / 4 * 1000 * edad) + " manzanas.");
    }
}
