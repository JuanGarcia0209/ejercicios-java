import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;

        System.out.print("Digite un número: ");
        num = scanner.nextFloat();

        if (num < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es positivo");
        }
    }
}
