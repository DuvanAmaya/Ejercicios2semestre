import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad: ");
        double cantidad = scanner.nextDouble();

        double iva = calcularIVA(cantidad);

        System.out.println("El IVA sobre " + cantidad + " es: " + iva);

        scanner.close();
    }

    public static double calcularIVA(double cantidad) {
        // El iva esta en 16%
        double porcentajeIVA = 0.16;
        double iva = cantidad * porcentajeIVA;
        return iva;
    }
}
