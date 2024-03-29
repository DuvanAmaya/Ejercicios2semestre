import java.util.Scanner;

public class Ejercicio63 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int suma = 0;
            int valor;
    
            do {
                System.out.print("Ingrese un valor entero (0 para terminar): ");
                valor = scanner.nextInt();
    
                if (valor > 0) {
                    suma += valor;
                }
            } while (valor != 0 && (valor <= 20 || valor > 30));
    
            System.out.println("La suma de los valores mayores a 0 introducidos es: " + suma);
        }
    }
    
