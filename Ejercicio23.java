import java.util.Scanner;

public class Ejercicio23 {
    
    public static void main(String[]args){
        Scanner lectura = new Scanner(System.in);
        String intercambio;
        boolean pass=true;
        int op = 4;
        int[] array = new int[3];

        System.out.println("_______________________________________________________________________________________");
        System.out.println("Juego Var");
        System.out.println("Tienes que afirmar la respuesta correcta para poder ganar.");
        System.out.println("_______________________________________________________________________________________");
        System.out.println("Tendrás 4 acciones para elegir la opción correcta.");
        System.out.println("debes adivinar entre un número del 0 al 9 y luego adivinar 3 tres veces");
        System.out.println("_______________________________________________________________________________________");
        System.out.println("Tendrás un cartel que indica si el número está en el rango (amarillo), si es verdadero (verde) y si es falso (rojo).");
        System.out.println("_______________________________________________________________________________________");


        for(int i =0; i < 3;i++){
            int numero = (int)(Math.random() * 8) + 1;
            array[i] = numero;
        }

        while(pass){
            int[] arrayComparativo = new int[3];
            String[] resultados = new String[3];

            for(int j = 0;j < 3; j++){
                System.out.println("Escriba el numero " + (j+1) );
                arrayComparativo[j] = lectura.nextInt();
            }

            for(int i = 0; i < 3; i++){
                
                if(array[i] == arrayComparativo[i]){
                    resultados[i] = "Verde";
                }else{
                    for(int h = 0; h < 3; h++){
                        for(int j = 0;j < 3; j++){
                        if (array[h] == arrayComparativo[j] && resultados[j] == null ) {
                            resultados[j] = "Amarillo";
                        
                    }
                }
            }
                if(resultados[i] == null){
                    resultados[i] = "Rojo";
                }
                
            }
        }

            System.out.println("Random numbers: 1:-- (" + array[0] + ")-- 2:-- (" + array[1] + ")  3: -- (" + array[2] + ")");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("El resultado es: 1: " + resultados[0] + "----- 2: " + resultados[1] + "-----  3: " + resultados[2]  );

            if(resultados[0] == "Verde" && resultados[1] == "Verde" && resultados[2] == "Verde"){
                System.out.println("GANASTE, FELICIDADES");
                pass= false;
            }else{
                op--;
                System.out.println("Numeros de intentos " + op);
                if (op== 0) {
                    System.out.println("JAJAJA Perdiste, intenta de nuevo");
                    pass=false;
                }
            }

    }
}
}