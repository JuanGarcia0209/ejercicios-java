import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double area, radio;

        System.out.print("Digite el radio del circulo(cm): ");
        radio = scanner.nextDouble();

        area = Math.PI * (radio * radio);

        System.out.println("El area del circulo es: " + area + " cm2.");
    }
}
