import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        System.out.println("Digite un texto: ");
        texto = scanner.nextLine();

        System.out.println("La primera letra es: " + (char) texto.charAt(0));
    }
}
