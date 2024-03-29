import java.util.Scanner;

public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de términos a generar para la serie Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("La serie Fibonacci es:");
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int primero = 11, segundo = 23, siguiente;

        if (n >= 1) {
            System.out.print(primero + " ");
        }
        if (n >= 2) {
            System.out.print(segundo + " ");
        }

        for (int i = 3; i <= n; i++) {
            siguiente = primero + segundo;
            System.out.print(siguiente + " ");
            primero = segundo;
            segundo = siguiente;
        }
    }
}

