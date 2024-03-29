import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += factorial(i);
            suma += i + 10; // Sumar 11, 12, 13, ..., n+10
        }

        System.out.println("La suma de 11 + 2 + 3! + ... + n! es: " + suma);
    }

    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
