import java.util.Scanner;

public class Ejercicio14 {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("Digite un número de 4 cifras: ");
        n = scanner.nextInt();
        
        System.out.println("Primera cifra: " + n / 1000);
        System.out.println("Segunda cifra: " + n % 1000 / 100);
        System.out.println("Tercera cifra: " + n % 100 / 10);
        System.out.println("Cuarta cifra: " + n % 10);
    }
}
