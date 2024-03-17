import java.util.Scanner;

public class Ejercicio12 {
    static Scanner scanner = new Scanner(System.in);
    static double r[] = new double[5], n;
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite un número: ");
            n = scanner.nextDouble();
            r[4] += n;

            if (i < 2) {
                for (int j = 0; j < (i + 2); j++) {
                    r[i] += n;
                }
            }else{
                r[i] = n * n;
            }
        }

        r[3] = r[4] / 3;

        System.out.println("El promedio de los números es: " + r[3]);
        System.out.println("La suma de los números es: " + r[4]);
        System.out.println("El doble del primer número es: " + r[0]);
        System.out.println("El triple del segundo número es: " + r[1]);
        System.out.println("El cuadrado del tercer número es: " + r[2]);
    }
}