import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            System.out.println("El numero es positivo");

        } else {
            System.out.println("El numero es negativo");
        }
    }
}