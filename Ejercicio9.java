import java.util.Scanner;

public class Ejercicio9 {
    static Scanner scanner = new Scanner(System.in);
    static final double iva = 0.19;
    static double n, total;
    public static void main(String[] args) {
        System.out.println("Digite un valor para calcular el IVA a aplicar.");
        n = scanner.nextDouble();

        total = n * iva;

        System.out.println("El iva a aplicar es de: " + total);
    }
}
