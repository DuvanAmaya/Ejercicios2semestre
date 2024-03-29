import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en grados centígrados: ");
        double gradosCent = scanner.nextDouble();

        double gradosFahren = gradosCent*9/5+32;
        System.out.println(gradosCent + " grados centígrados convertidos a fahrenheit es igual a: " + gradosFahren + " grados fahrenheit");
    }
}
