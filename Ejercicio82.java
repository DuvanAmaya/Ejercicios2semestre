import java.util.Scanner;

public class Ejercicio82 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cualquier numero: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            System.out.println(numero +" es positivo");
        } else {
            System.out.println(numero +" es negativo");
        }
    }
}
