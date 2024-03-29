import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int numero;

        // Leer números hasta que se introduzca un cero
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero > 0) {
                contador++;
            }
        } while (numero != 0);

        // Mostrar el número de valores mayores que cero leídos
        System.out.println("El número de valores mayores que cero leídos es: " + contador);
    }
}
