import java.util.Scanner;

public class Ejercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Ingrese la longitud del vector: ");
        int longitudVector = scanner.nextInt();

        int[] vector = new int[longitudVector];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < longitudVector; i++) {
            System.out.print("Vector[" + i + "]: ");
            vector[i] = scanner.nextInt();
        }

        int primosMatriz = contarPrimos(matriz);
        int primosVector = contarPrimos(vector);

        System.out.println("Cantidad de números primos en la matriz: " + primosMatriz);
        System.out.println("Cantidad de números primos en el vector: " + primosVector);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarPrimos(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (esPrimo(elemento)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int contarPrimos(int[] vector) {
        int contador = 0;
        for (int elemento : vector) {
            if (esPrimo(elemento)) {
                contador++;
            }
        }
        return contador;
    }
}
