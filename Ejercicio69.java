public class Ejercicio69 {
    public static void main(String[] args) {
        int numero = 21;
        int suma = 0;
        
        for (int i=22; i<=100; i+=2) {
            suma =suma + i;
        }
        
        int total = numero + suma;
        
        System.out.println("La suma de todo es " + total);
    }
    
}
