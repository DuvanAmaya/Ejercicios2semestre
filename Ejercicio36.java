import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite las horas: ");
        int horas = scanner.nextInt();
        System.out.println("Digite los minutos: ");
        int minutos = scanner.nextInt();

        double pagoHrs = horas *15.00;
        double min = 15.00/60;
        double pagoMin = minutos * min;
        double pagoAmbos = pagoMin + pagoHrs;


        System.out.println(pagoAmbos);
    }
}