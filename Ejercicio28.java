import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para iniciar la cuenta regresiva: ");
        int numero = scanner.nextInt();

        System.out.println("Cuenta regresiva:");

        // Realizamos la cuenta regresiva desde el número ingresado hasta 0
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
