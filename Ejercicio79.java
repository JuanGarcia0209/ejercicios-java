public class Ejercicio79 {
    public static void main(String[] args) {
        int voltajeBombillo = 120;
        int cantidadBombillos = 3;

        int voltajeTotal = voltajeBombillo * cantidadBombillos;

        double voltajeTotalKilovoltios = voltajeTotal / 1000;

        System.out.println("El voltaje total de los tres bombillos es de " + voltajeTotalKilovoltios + " kV");
    }
}
