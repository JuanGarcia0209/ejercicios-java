import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;

        System.out.print("Digite un número real");
        r = scanner.nextInt();

        if (r < 0) {
            System.out.println("-1");
        }else if(r == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
