import java.util.Scanner;

public class Ejercicio64{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número base (x): ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el exponente (y): ");
        int y = scanner.nextInt();

        int resultado = calcularPotencia(x, y);

        System.out.println("El resultado de " + x + "^" + y + " es: " + resultado);
    }

    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
