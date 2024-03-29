import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud de la diagonal 1: ");
        double diagonal1 = scanner.nextDouble();

        System.out.print("Ingresa la longitud de la diagonal 2: ");
        double diagonal2 = scanner.nextDouble();

        if (diagonal1 <= 0 || diagonal2 <= 0) {
            System.out.println("Las longitudes de las diagonales deben ser números positivos.");
            return;
        }

        double area = AreaDelRombo(diagonal1, diagonal2);
        System.out.println("El área del rombo con diagonales de longitud " + diagonal1 + " y " + diagonal2 + " es: " + area);
    }

    public static double AreaDelRombo(double d1, double d2) {
        double area = (d1 * d2) / 2;
        return area;
    }
}
