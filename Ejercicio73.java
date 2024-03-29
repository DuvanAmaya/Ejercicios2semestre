import java.util.Scanner;

public class Ejercicio73{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = scanner.nextDouble();

        double descuento = calcularDescuento(sueldo);
        double sueldoNeto = sueldo - descuento;

        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Sueldo neto recibido por el trabajador: " + sueldoNeto);
    }

    public static double calcularDescuento(double sueldo) {
        double descuento;

        if (sueldo <= 1000) {
            descuento = sueldo * 0.10; // 10% de descuento
        } else if (sueldo <= 2000) {
            descuento = 1000 * 0.10 + (sueldo - 1000) * 0.05; // 10% del primer tramo + 5% del adicional
        } else {
            descuento = 1000 * 0.10 + 1000 * 0.05 + (sueldo - 2000) * 0.03; // 10% del primer tramo + 5% del segundo tramo + 3% del adicional
        }

        return descuento;
    }
}
