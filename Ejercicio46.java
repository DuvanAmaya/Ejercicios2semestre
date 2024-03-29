import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la distancia en millas
        System.out.print("Ingrese la distancia en millas: ");
        double distanciaMillas = scanner.nextDouble();
        
        // Definir el factor de conversión
        final double MILLA_A_METRO = 1852.0;
        
        // Calcular la distancia en metros
        double distanciaMetros = distanciaMillas * MILLA_A_METRO;
        
        // Mostrar el resultado
        System.out.println(distanciaMillas + " millas equivalen a " + distanciaMetros + " metros.");
        
        scanner.close();
    }
}
