/**
 * Ejercicio16
 */
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        float nota;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la nota del estudiante: ");

        if (scanner.nextFloat() < 3) {
            System.out.println("Estudiante reprobado.");
        }else{
            System.out.println("Estudiante aprobado.");
        }
    }
}