import java.util.Scanner;

public class Ejercicio8 {
    static int n1, n2, r;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite un número entero para hallar el residuo de la división");
        System.out.print("Digite el dividendo: ");
        n1 = scanner.nextInt();

        System.out.print("Digite el divisor: ");
        n2 = scanner.nextInt();

        r = n1 % n2;

        System.out.println("El residuo de la división es " + r);
    }
}
