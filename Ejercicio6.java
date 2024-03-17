import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        float num = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite el número #" + i + ": ");
            num += scanner.nextFloat();
        }

        num /= 3;

        System.out.println("La media aritmética de los números ingresados es: " + num );
    }
}
