import java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite las horas: ");
        int horas = scanner.nextInt();
        System.out.println("Digite los minutos: ");
        int minutos = scanner.nextInt();

        double pagoHrs = horas *15.00;

        if (minutos <= 10) {
            System.out.println("El cliente debe pagar: " + pagoHrs);
        } else {
            System.out.println("El cliente debe pagar: " + (pagoHrs+15.00));
        }

    }
}