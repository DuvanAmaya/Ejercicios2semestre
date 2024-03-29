public class Ejercicio61 {
    public static void main(String[] args) {
        int sumaCuadrados = 0;

        for (int i = 1; i <= 10; i++) {
            sumaCuadrados += i * i;
        }

        System.out.println("La suma de los cuadrados de los primeros 10 enteros mayores que cero es: " + sumaCuadrados);
    }
}
