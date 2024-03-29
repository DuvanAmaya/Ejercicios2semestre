import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        int suma=1;
        int vari=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un numero postivo");
        int numero = scanner.nextInt();

        for(int i = 1;i<numero;i++){
            suma += vari * (suma);
            System.out.println(suma);
            vari++;
        }
        System.out.println(suma);
    }
}