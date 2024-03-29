import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la medida en centimetros: ");
        double cm = scanner.nextDouble();

        //1pulgada = 2,54cm
        double pulgadas = cm / 2.54;
        System.out.println(cm + " centimetros equivalen a " + pulgadas + " pulgadas");

    }
}
