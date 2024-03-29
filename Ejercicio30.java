import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la distancia en kilómetros: ");
        double distanciaKilometros = scanner.nextDouble();

        double distanciaMetros = convertirKmAMtrs(distanciaKilometros);

        System.out.println("La distancia en metros es: " + distanciaMetros + " metros");

        scanner.close();
    }

    // Función para convertir kilómetros a metros
    public static double convertirKmAMtrs(double distanciaKilometros) {
        return distanciaKilometros * 1000;
    }
}
