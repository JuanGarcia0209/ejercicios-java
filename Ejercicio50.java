import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, suma = 0, multiplicacion = 1;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite un número entero o real: ");
            n = scanner.nextInt();
            
            suma += n;
            multiplicacion *= n;
        }

        System.out.println("La suma de los valores ingresados es: " + suma);
        System.out.println("La multiplicación de los valores ingresados es: " + multiplicacion);
    }
}
