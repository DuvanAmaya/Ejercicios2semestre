import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario la cantidad comprada, el precio original y el precio pagado
        System.out.print("Ingrese la cantidad comprada: ");
        double cantidadComprada = scanner.nextDouble();
        
        System.out.print("Ingrese el precio original: ");
        double precioOriginal = scanner.nextDouble();
        
        System.out.print("Ingrese el precio pagado: ");
        double precioPagado = scanner.nextDouble();
        
        // Calcular el porcentaje descontado
        double porcentajeDescontado = ((precioOriginal - precioPagado) / precioOriginal) * 100;
        
        // Mostrar el resultado
        System.out.println("El porcentaje descontado es: " + porcentajeDescontado + "%");
        
        scanner.close();
    }
}

