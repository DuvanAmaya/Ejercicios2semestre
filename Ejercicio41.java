import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la edad: ");
        int edad = scanner.nextInt();

        int edadMeses = edad * 12;
        double peloCm = edadMeses * 0.5;
        double PeloMtrs = peloCm/100;
        System.out.println("El cabello mide: " + PeloMtrs + " metro");

    }
}