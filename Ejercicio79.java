import java.util.Scanner;

public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el voltaje del primer bombillo (en V): ");
        double voltajeBombillo1 = scanner.nextDouble();

        System.out.print("Ingrese el voltaje del segundo bombillo (en V): ");
        double voltajeBombillo2 = scanner.nextDouble();

        System.out.print("Ingrese el voltaje del tercer bombillo (en V): ");
        double voltajeBombillo3 = scanner.nextDouble();

        double voltajeTotal = voltajeBombillo1 + voltajeBombillo2 + voltajeBombillo3;

        double voltajeTotalEnKilovoltios = voltajeTotal / 1000;

        System.out.println("El voltaje total de los tres bombillos es: " + voltajeTotalEnKilovoltios + " kV");
    }
}
