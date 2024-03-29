import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo básico del empleado: ");
        double sueldoBasico = scanner.nextDouble();

        System.out.print("Ingrese el monto por horas extras: ");
        double horasExtras = scanner.nextDouble();

        // Calcular el total ganado (incluyendo las horas extras)
        double totalGanado = sueldoBasico + horasExtras;

        // Descuento del 20%
        double descuento = totalGanado * 0.20;

        // Calcular el total ganado después del descuento
        double totalDespuesDescuento = totalGanado - descuento;

        System.out.println("Sueldo básico del empleado: " + sueldoBasico);
        System.out.println("Total del descuento (20%): " + descuento);
        System.out.println("Total ganado después del descuento: " + totalDespuesDescuento);

    }
}
