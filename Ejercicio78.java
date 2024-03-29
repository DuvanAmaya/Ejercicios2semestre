import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto: ");
        double monto = scanner.nextDouble();

        double descuento = calcularDescuento(monto);

        System.out.println("El descuento aplicado es: " + descuento);
    }

    public static double calcularDescuento(double monto) {
        double descuento;

        if (monto > 10000) {
            descuento = monto * 0.20; // Descuento del 20% para montos mayores a 10000
        } else {
            descuento = monto * 0.10; // Descuento del 10% para montos menores o iguales a 10000
        }

        return descuento;
    }
}
