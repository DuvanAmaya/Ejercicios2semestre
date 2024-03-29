import java.util.Scanner;

public class Ejercicio57 {
    public static int sumaDigitos(int numero) {
        int suma = 0;
        
        // Mientras el número sea mayor que 0
        while (numero > 0) {
            // Se suma el último dígito al total
            suma += numero % 10;
            // Se elimina el último dígito del número
            numero /= 10;
        }
        
        return suma;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite cualquier numero: ");
        int numero = scanner.nextInt();
        int suma = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }
}
