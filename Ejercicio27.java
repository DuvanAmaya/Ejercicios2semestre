import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("elige su genero: ");
        System.out.println("1.Hombre 2.Mujer 3.Ninguno");
        int op = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        switch (op) {
            case 1:
                System.out.println("Bienvenido " + nombre);
                break;
            case 2: 
                System.out.println("Bienvenida " + nombre);
                break;
            case 3:
                System.out.println("Hola indeciso");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
