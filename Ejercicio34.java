import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monto;

        System.out.print("Digite el monto para calcular el descuento: ");
        monto = scanner.nextDouble();

        if (monto > 1000) {
            System.out.println("El descuento es de 10%: " + (monto - (monto * 0.1)));
        } else if (monto > 500) {
            System.out.println("El descuento es de 20%: " + (monto - (monto * 0.2)));
        }
    }
}
