import java.util.Scanner;
public class Ejercicio65 {

    public static void main(String[] args) {
        int conteoNumeros=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba hasta donde desea el numero");
        int numero  = scanner.nextInt();

        for(int i = 1;i<=numero;i++){

            conteoNumeros+= i;
        }

        System.out.println("La suma de los numeros es de " + conteoNumeros);
    }
}