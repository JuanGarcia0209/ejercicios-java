import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sb, extra;

        System.out.println("Digite el sueldo base: ");
        sb = scanner.nextFloat();

        System.out.println("Digite el pago ganado por horas extras: ");
        extra = scanner.nextFloat();

        System.out.println("Sueldo básico: " + sb);
        System.out.println("Descuento: " + (sb * 0.2));
        System.out.println("Total: " + (sb + extra - (sb * 0.2)));
    }
}
