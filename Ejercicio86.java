import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaVoltajes = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el voltaje " + i + ": ");
            double voltaje = scanner.nextDouble();
            sumaVoltajes += voltaje;
        }

        double promedio = sumaVoltajes / 5;

        System.out.println("El promedio de voltajes es: " + promedio);

        if (promedio > 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("VOLTAJE CORRECTO");
        }
    }
}
