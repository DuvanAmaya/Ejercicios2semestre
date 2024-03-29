import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el largo del rectangulo: ");
        float largo = scanner.nextFloat();
        System.out.println("Ingrese el ancho del rectangulo: ");
        float ancho = scanner.nextFloat();
        float area = largo*ancho;
        System.out.println("El area del rectangulo es: " + area);
    }
}