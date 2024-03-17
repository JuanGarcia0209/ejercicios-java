/**
 * Ejercicio30
 */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distancia;
        
        System.out.print("Digite la distancia en kilómetros: ");
        distancia = scanner.nextDouble();

        System.out.println("La cantidad de metros en " + distancia + " kilómetros de distancia es de: " + (distancia * 1000));
    }
}