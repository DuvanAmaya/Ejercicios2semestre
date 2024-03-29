import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la edad de la persona: ");
        int edad = scanner.nextInt();

        int gramosConsumidos = edad * 8 * 1000;
        int manzanas = gramosConsumidos/4;

        System.out.println("La cantidad de fruta consumida en gramos es de " + gramosConsumidos +"g");
        System.out.println("La persona ha consumido: " + manzanas +"g en manzanas");
    }
}