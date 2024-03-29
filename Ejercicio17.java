import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        float n1 = scanner.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        float n2 = scanner.nextFloat();

        if (n1 > n2) {
            System.out.println("El numero mayor es: " + n1);
        } else if (n1 == n2) {
            System.out.println("Ambos numeros son iguales");
        } else 
        System.out.println("El numero mayor es: " + n2);
    }
}