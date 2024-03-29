import java.util.Scanner;

public class Ejercicio76{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int cifras = calcularCifras(numero);

        System.out.println("El número de cifras de " + numero + " es: " + cifras);
    }

    public static int calcularCifras(int numero) {
        numero = Math.abs(numero);

        int cifras = 0;

        while (numero != 0) {
            numero = numero / 10;
            cifras++;
        }

        return cifras;
    }
}
