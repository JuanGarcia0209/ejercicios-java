import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita un numero");
        int numero = entrada.nextInt();

        int suma=0;

        for(int i=1;i<=numero;i+=2){
            suma =suma+i;

        }
        System.out.println("La suma de todos los números que lleva "+numero+" de dos en dos es igual a "+suma);

    }
}
