import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo: ");
        float base = scanner.nextFloat();
        System.out.println("Ingrese la altura del triángulo: ");
        float altura = scanner.nextFloat();
        float area = (base*altura)/2;
        System.out.println("El area del triángulo es: " + area);
    }
}