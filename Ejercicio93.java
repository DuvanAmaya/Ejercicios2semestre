import java.util.Scanner;

public class Ejercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        int segundos = minutosRestantes * 60;
        
        System.out.println("Tiempo: " + horas + " horas, " + minutosRestantes + " minutos, " + segundos + " segundos.");
    }
}