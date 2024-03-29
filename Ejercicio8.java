import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.print("Ingresa el divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Error: El divisor no puede ser cero.");
        } else {
            int resto = calcularResto(dividendo, divisor);
            System.out.println("El resto de la división " + dividendo + " entre " + divisor + " es: " + resto);
        }
    }

    public static int calcularResto(int dividendo, int divisor) {
        return dividendo % divisor;
    }
}
