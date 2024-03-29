import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tiempo en segundos
        System.out.print("Ingresa el tiempo en segundos: ");
        int tiempoSegundos = scanner.nextInt();

        // Calcular horas, minutos y segundos
        int horas = tiempoSegundos / 3600;
        int minutos = (tiempoSegundos % 3600) / 60;
        int segundos = tiempoSegundos % 60;

        // Mostrar el resultado
        System.out.println("El tiempo es: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }
}

