import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.print("Digite la edad de la persona: ");
        a = scanner.nextInt();

        System.out.println("El cabello de la persona ha crecido un total de " + (0.5 * 12 * a / 100) + " metros.");
    }
}
