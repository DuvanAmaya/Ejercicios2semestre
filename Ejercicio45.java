import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero real: ");
        double numeroReal = scanner.nextDouble();
        
        int resultado = determinarSigno(numeroReal);
        
        System.out.println("El resultado es: " + resultado);
    }
    
    public static int determinarSigno(double numero) {
        if (numero > 0) {
            return 1;
        } else if (numero < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
