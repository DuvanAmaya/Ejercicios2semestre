import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();
        
        // Realizar la suma y la multiplicación
        double suma = numero1 + numero2 + numero3;
        double multiplicacion = numero1 * numero2 * numero3;
        
        // Mostrar los resultados
        System.out.println("La suma de los tres números es: " + suma);
        System.out.println("La multiplicación de los tres números es: " + multiplicacion);
        
        scanner.close();
    }
}
