import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el año de nacimiento
        System.out.print("Ingrese el año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();
        
        // Solicitar el año actual
        System.out.print("Ingrese el año actual: ");
        int añoActual = scanner.nextInt();
        
        // Solicitar el nombre de la persona
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.next();
        
        // Calcular la edad de la persona
        int edad = añoActual - añoNacimiento;
        
        // Calcular el número total de días dormidos
        int diasTotalesDormidos = (int) (edad * 365 * 0.34); // 365 días en un año y 34% de su vida durmiendo
        
        // Imprimir el resultado
        System.out.println(nombre + " ha dormido " + diasTotalesDormidos + " días en su vida.");
        
        scanner.close();
    }
}
