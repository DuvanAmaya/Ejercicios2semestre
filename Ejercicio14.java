import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de cuatro dígitos: ");
        int numero = scanner.nextInt();

        if (numero < 1000 || numero > 9999) {
            System.out.println("El número ingresado no tiene cuatro dígitos.");
            return;
        }

        // Descomponer el número en sus dígitos individuales
        int primerDigito = numero / 1000;
        int segundoDigito = (numero % 1000) / 100;
        int tercerDigito = (numero % 100) / 10;
        int cuartoDigito = numero % 10;

        // Suma de los dígitos
        int sumaDigitos = primerDigito + segundoDigito + tercerDigito + cuartoDigito;

        System.out.println("La suma de los dígitos es: " + sumaDigitos);

        scanner.close();
    }
}
