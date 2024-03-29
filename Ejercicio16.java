import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del examen: ");
        float nota = scanner.nextFloat();

        if (nota >= 3.0) {
            System.out.println("Gano el examen de matematicas");
        } else {
            System.out.println("No gano el examen de matematicas");
        }
    }
}