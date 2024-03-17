import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite un número para determinar si es primo: ");
        n = scanner.nextInt();

        if (n%2 != 0 || n%3 != 0 || n%5 != 0) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
