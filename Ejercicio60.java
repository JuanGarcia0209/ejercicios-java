import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, cont = 0;

        do {
            System.out.print("Digite un número entero: ");
            n = scanner.nextInt();

            if (n > 0) {
               cont++; 
            }
        } while (n != 0);

        System.out.println("Los números ingresados mayores que 0 fueron " + cont);
    }
}
