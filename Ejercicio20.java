import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        // Calcular el promedio de las notas
        double promedio = suma / notas.length;

        // Imprimir la suma y el promedio de las notas
        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);

        // Imprimir el doble de cada nota
        System.out.println("El doble de las notas es:");
        for (double nota : notas) {
            System.out.println(nota * 2);
        }

        scanner.close();
    }
}
