import java.util.Scanner;

public class Ejercicio58 {
    public static double calcularSalario(double horasTrabajadas, double valorHora) {
        return horasTrabajadas * valorHora;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las horas trabajadas y el valor por hora al usuario
        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingrese el valor por hora: ");
        double valorHora = scanner.nextDouble();

        // Calcular el salario llamando a la función calcularSalario
        double salario = calcularSalario(horasTrabajadas, valorHora);

        // Mostrar el salario calculado
        System.out.println("El salario es: " + salario);
    }
}
