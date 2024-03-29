import java.util.Scanner;

public class Ejercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        ordenarNumeros(num1, num2, num3);
    }

    public static void ordenarNumeros(double num1, double num2, double num3) {
        double temp;

        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;

            if (num1 < num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }

        System.out.println("Los números ordenados de mayor a menor son: " + num1 + ", " + num2 + ", " + num3);
    }
}
