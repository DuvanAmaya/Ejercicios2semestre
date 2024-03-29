public class Ejercicio29 {
    public static void main(String[] args) {
        float numero = 5.0f;
        float cubo = calcularCubo(numero);
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }

    public static float calcularCubo(float numero) {
        return numero * numero * numero;
    }
}
