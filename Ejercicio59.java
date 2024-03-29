import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número que quiera imprimir su tabla: ");
        int numTabla = scanner.nextInt();
        if (numTabla < 1 || numTabla > 10) {
            System.out.println("El número ingresado no está en el rango válido.");
        } else {
            // Mostrar la tabla de multiplicar del número ingresado
            tablaMultiplicar(numTabla);
        }
    }
    public static void tablaMultiplicar(int numero) {
        // Iterar desde 0 hasta 10 e imprimir cada multiplicación
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
