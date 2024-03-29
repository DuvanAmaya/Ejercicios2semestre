public class Ejercicio21 {
    public static void main (String[] args) {
        int variableA=5, variableB=10;
        System.out.println("La variable A vale: " + variableA + " y la variable B vale: " + variableB);
        System.out.println("Hacemos el cambio de valor");
        int cambio = variableA;
        variableA = variableB;
        variableB = cambio;
        System.out.println("El nuevo valor de la variable A es: " + variableA + " y de la variable B es: " + variableB);
    }
}
