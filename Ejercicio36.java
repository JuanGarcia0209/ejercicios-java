import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double tarifa = 15;
        int horas = 0, minutos = 0;
        double total;

        System.out.print("digite la cantidad de horas estacionado: ");
        horas = scanner.nextInt();

        System.out.print("digite la cantidad de minutos estacionado restantes: ");
        minutos = scanner.nextInt();

        total = horas * tarifa; // + ((tarifa / 60) * minutos);

        while (minutos > 0) {
            total += tarifa;
            minutos -= 60;
        }

        System.out.println("El total a pagar es de: " + total);
    }
}
