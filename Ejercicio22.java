import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un numero real: ");
        double real = scanner.nextDouble();

        int parteEntera = (int) real;
        double parteDecimal = real - parteEntera;

        System.out.println("La parte entera del numero real es: " + parteEntera);
        System.out.println("La parte decimal del numero real es: " + parteDecimal);
    }
}
