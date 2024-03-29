import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        double voltiosPorNaranja = 0.05;
        double pesoPorNaranjaGramos = 6.0;

        // Pedir al usuario la cantidad de kilovoltios requeridos para el sistema de iluminación
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilovoltios requeridos para el sistema de iluminación: ");
        double kilovoltiosRequeridos = scanner.nextDouble();

        // Calcular el número de naranjas requeridas para producir la cantidad de kilovoltios
        double naranjasRequeridas = kilovoltiosRequeridos * 1000 / voltiosPorNaranja;

        // Calcular el peso total en gramos y convertirlo a toneladas
        double pesoTotalGramos = naranjasRequeridas * pesoPorNaranjaGramos;
        double pesoTotalToneladas = pesoTotalGramos / 1000000;

        // Mostrar el resultado
        System.out.println("El número de naranjas requeridas es: " + naranjasRequeridas);
        System.out.println("El peso total necesario en toneladas es: " + pesoTotalToneladas);
    }
}
