import java.util.Scanner;

public class Ejercicio112 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Línea de autobuses ADO, seleccione su destino");
        System.out.println("a) Cartagena");
        System.out.println("b) Barranquilla");
        System.out.println("c) Sincelejo");
        System.out.println("d) Valledupar");
        System.out.println("e) Santa Marta");
    
        System.out.print("Seleccione una opción: ");
        char opcion = entrada.next().charAt(0);
    
        switch (opcion) {
            case 'a':
                System.out.println("Su destino es 'Cartagena', tiempo de traslado 2 hrs, costo $150");
                break;
            case 'b':
                System.out.println("Su destino es 'Barranquilla', tiempo de traslado 3 hrs, costo $320");
                break;
            case 'c':
                System.out.println("Su destino es 'Sincelejo', tiempo de traslado 1.5 hrs, costo $120");
                break;
            case 'd':
                System.out.println("Su destino es 'Valledupar', tiempo de traslado 2.5 hrs, costo $90");
                break;
            case 'e':
                System.out.println("Su destino es 'Santa Marta', tiempo de traslado 3 hrs, costo $110");
                break;
            default:
                System.out.println("Opción no válida. Por favor seleccione una opción válida.");
        }
    }
    
    }

