import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer numero: ");
        double num3 = scanner.nextDouble();

        double media = calcularMedia(num1, num2, num3);
        System.out.println("La media aritmetica de los numeros " + num1 + ", " + num2 + " y " + num3 + " es: " + media);
    }

    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}