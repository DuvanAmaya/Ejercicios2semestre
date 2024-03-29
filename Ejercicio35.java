import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese la tarifa por hora en pesos: ");
        double tarifaPorHora = scanner.nextDouble();

        double salario = calcularSalario(horasTrabajadas, tarifaPorHora);

        System.out.println("El salario del profesor es: $" + salario);

    }

    public static double calcularSalario(int horasTrabajadas, double tarifaPorHora) {
        double salario;

        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            salario = (40 * tarifaPorHora) + (horasExtras * (tarifaPorHora * 1.5));
        } else {
            salario = horasTrabajadas * tarifaPorHora;
        }

        return salario;
    }
}
