public class Ejercicio49 {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        char primeraLetra = obtenerPrimeraLetra(texto);
        System.out.println("La primera letra del texto \"" + texto + "\" es: " + primeraLetra);
    }
    
    public static char obtenerPrimeraLetra(String texto) {
        if (texto != null && texto.length() > 0) {
            return texto.charAt(0);
        } else {
            throw new IllegalArgumentException("La cadena de texto está vacía o nula.");
        }
    }
}
