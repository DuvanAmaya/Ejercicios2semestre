import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del rectángulo en metros: ");
        double longitudMetros = scanner.nextDouble();

        System.out.print("Ingresa la anchura del rectángulo en metros: ");
        double anchuraMetros = scanner.nextDouble();

        double areaMetros = calcularAreaRectangulo(longitudMetros, anchuraMetros);
        double areaCentimetros = areaMetros * 10000;
        double areaMilimetros = areaCentimetros * 100;

        System.out.println("El área del rectángulo es:");
        System.out.println("- En metros cuadrados: " + areaMetros + " m²");
        System.out.println("- En centímetros cuadrados: " + areaCentimetros + " cm²");
        System.out.println("- En milímetros cuadrados: " + areaMilimetros + " mm²");

    }

    public static double calcularAreaRectangulo(double longitud, double anchura) {
        return longitud * anchura;
    }
}
