import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float base, altura, area;

        System.out.print("Digite la base: ");
        base = scanner.nextFloat();
        System.out.print("Digite la altura: ");
        altura = scanner.nextFloat();

        area = base * altura / 2;

        System.out.println("El área del triangulo es: " + area);
    }
}
