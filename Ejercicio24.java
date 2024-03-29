import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pulgadas: ");
        double pulgadas = scanner.nextDouble();

        //Una pulgada es igual a 2.54cm
        double cm = pulgadas*2.54;
        System.out.println(pulgadas + " pulgadas en centimetros son: " + cm + "cm");
    }
}
