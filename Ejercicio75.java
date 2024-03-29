import java.util.Scanner;

public class Ejercicio75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        boolean esBisiesto = esAnioBisiesto(año);

        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }

    public static boolean esAnioBisiesto(int año) {
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}

