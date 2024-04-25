import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n2[] = new double[5], sum = 0, n;

        for (int i = 1; i <= n2.length; i++) {
            System.out.print("Digite la nota #" + i + ": ");
            n =  scanner.nextDouble();

            n2[i - 1] = n * 2;
            sum += n;
        }

        System.out.println("Suma de las notas: " + sum);
        System.out.println("Promedio de las notas: " + (sum / 5));
        System.out.println("Notas duplicadas:");

        for (double d : n2) {
            System.out.println("- " + d);
        }
    }
}
