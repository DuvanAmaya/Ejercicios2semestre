public class Ejercicio43 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        int menorNumero = calcularMenor(num1, num2);
        
        System.out.println("El número menor es: " + menorNumero);
    }
    
    public static int calcularMenor(int num1, int num2) {
        return Math.min(num1, num2);
    }
}
