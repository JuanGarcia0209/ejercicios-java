import java.util.Scanner;

public class Ejercicio15 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite la edad de la persona: ");

        if (scanner.nextInt() >= 18) {
            System.out.println("La persona es un adulto.");
        } else {
            System.out.println("La persona no es un adulto.");
        }
    }
}

