import java.util.Scanner;

public class Ejercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese el número de celular: ");
        String celular = scanner.nextLine();

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Número de celular: " + celular);
    }
}
