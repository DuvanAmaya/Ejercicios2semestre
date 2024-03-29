import java.util.Scanner;

public class Ejercicio70 {
    
    public static void main(String[] args) {
        int i=0;
        int suma=1;
        int vari=2;
        boolean pass=true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas veces desea hacer la suma y resta " );
        int numero = scanner.nextInt();

            for(int e = 1;e <numero;e++){

                if(pass){
                    suma= suma - vari;
                    pass=false;
                }else{
                    suma= suma + vari;
                    pass=true;
                }
                vari++;
            }

            System.out.println("El resultado es " + (suma));
    }
}