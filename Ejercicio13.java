import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int ultimoDigitoNum1 = num1 % 10;
        int ultimoDigitoNum2 = num2 % 10;
        int ultimoDigitoNum3 = num3 % 10;

        System.out.println("El último dígito del primer número es: " + ultimoDigitoNum1);
        System.out.println("El último dígito del segundo número es: " + ultimoDigitoNum2);
        System.out.println("El último dígito del tercer número es: " + ultimoDigitoNum3);

    }
}
