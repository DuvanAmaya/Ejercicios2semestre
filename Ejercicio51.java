import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la base y la altura del rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        
        // Calcular el área y el perímetro del rectángulo
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        // Mostrar los resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        
        scanner.close();
    }
}
