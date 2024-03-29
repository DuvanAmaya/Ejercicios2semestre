import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número que quiera imprimir su tabla: ");
        int numTabla = scanner.nextInt();
        tablaMultiplicar(numTabla);
    }
    
    public static void tablaMultiplicar(int numero) {
        // Iterar desde 0 hasta 10 e imprimir cada multiplicación
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
