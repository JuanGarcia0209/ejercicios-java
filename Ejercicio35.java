import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double horas, tarifa, total;

        System.out.print("Digite la tarifa por horas: ");
        tarifa = scanner.nextDouble();

        System.out.print("Digite las horas trabajadas: ");
        horas = scanner.nextDouble();

        if (horas > 40) {
            total = (tarifa * 40) + ((tarifa * 1.5) * (horas - 40));
        } else {
            total = tarifa * horas;
        }

        System.out.println("El salario del profesor es de: " + total);
    }
}