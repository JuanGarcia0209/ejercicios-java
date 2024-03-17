import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite una medida expresada en centímetros: ");

        System.out.println("Los centímetros ingresados equivalen a " + (scanner.nextDouble() / 2.54) + " pulgadas.");
    }
}
