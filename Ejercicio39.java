import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2;
        String name;

        System.out.print("Digite el nombre de la persona: ");
        name = scanner.next();

        System.out.print("Digite el año de nacimiento: ");
        a1 = scanner.nextInt();

        System.out.print("Digite el año actual: ");
        a2 = scanner.nextInt();

        System.out.println(name + " ha dormido un total de " + (int) ((a2 - a1) * 0.34 * 365) + " días.");
    }
}
