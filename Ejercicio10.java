import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args) { //Profesor este ejercicio es el mismo que el ejercicio 3 asi que lo hice lo mismo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo: ");
        float base = scanner.nextFloat();
        System.out.println("Ingrese la altura del triángulo: ");
        float altura = scanner.nextFloat();
        float area = (base*altura)/2;
        System.out.println("El area del triángulo es: " + area);
    }
}