import java.util.Scanner;

public class Ejercicio55 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numero");
        int numero =  scanner.nextInt();

        if ((numero % 2 == 0 || numero % 3 ==  0 || numero % 5 == 0 || numero % 7 == 0) && (numero != 2 && numero != 3 && numero != 5 && numero != 7)) {
            System.out.println("0; No es primo");
        } else {
            System.out.println("1; Es primo");
        }
    }
}
