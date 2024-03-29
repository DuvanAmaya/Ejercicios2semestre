import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra en pesos: ");
        double montoCompra = scanner.nextDouble();

        double descuento = calcularDescuento(montoCompra);
        double montoConDescuento = montoCompra - descuento;

        System.out.println("El monto de la compra es: $" + montoCompra);
        if (descuento > 0) {
            System.out.println("Se aplicó un descuento de: $" + descuento);
            System.out.println("El monto con descuento es: $" + montoConDescuento);
        } else {
            System.out.println("No se aplicó ningún descuento.");
        }

        scanner.close();
    }

    // Función para calcular el descuento según el monto de la compra
    public static double calcularDescuento(double monto) {
        if (monto > 1000) {
            return monto * 0.10;
        } else if (monto > 500) {
            return monto * 0.20;
        } else {
            return 0;
        }
    }
}
