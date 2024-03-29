import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del triángulo en milímetros: ");
        double baseMilimetros = scanner.nextDouble();

        System.out.print("Ingresa la altura del triángulo en milímetros: ");
        double alturaMilimetros = scanner.nextDouble();

        double areaMilimetros = calcularAreaTriangulo(baseMilimetros, alturaMilimetros);
        double areaCentimetros = areaMilimetros / 100;
        double areaMetros = areaCentimetros / 10000;

        System.out.println("El área del triángulo es:");
        System.out.println("- En milímetros cuadrados: " + areaMilimetros + " mm²");
        System.out.println("- En centímetros cuadrados: " + areaCentimetros + " cm²");
        System.out.println("- En metros cuadrados: " + areaMetros + " m²");

        scanner.close();
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
