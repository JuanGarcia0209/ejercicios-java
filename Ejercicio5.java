import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float area, lado, altura;

        System.out.print("Digite el lado del rombo: ");
        lado = scanner.nextFloat();
        System.out.print("Digite la altura del rombo: ");
        altura = scanner.nextFloat();

        area = lado * altura;

        System.out.println("El area del rombo es de " + area + "cm2.");
    }
}
