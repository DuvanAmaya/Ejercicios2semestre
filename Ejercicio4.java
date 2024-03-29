import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        float radio = scanner.nextFloat();
        float area = (float)(Math.PI*Math.pow(radio, 2));
        System.out.println("El área del circulo es: " + area);
    }
}