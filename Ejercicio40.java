import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilos de oro: ");
        double kilosOro = scanner.nextDouble();

        System.out.print("Ingrese el precio en pesos por onza de oro: ");
        double precioPorOnza = scanner.nextDouble();

        double gramosOro = kilosOro * 1000;

        double valorEnPesos = (gramosOro / 28.3495) * precioPorOnza;

        System.out.println("El valor de " + kilosOro + " kilos de oro es de $" + valorEnPesos);
    }
}
