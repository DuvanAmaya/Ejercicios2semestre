import java.util.Scanner;

public class Ejercicio33 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int CantPersonas=0,suma=0,Hombres=0,Mujeres=0;
        System.out.println("Digite la cantidad de empleados que desea registrar");
        int empleados = scanner.nextInt();

        for(int i = 1;  i <=empleados; i++){
            System.out.println("Empleado numero " + i);
            System.out.println("Digite el sexo: 1.Hombre --- 2.Mujer");
            int sexo = scanner.nextInt();
            System.out.println("Digite su salario");
            int salario = scanner.nextInt();

            if(salario >= 700){
                CantPersonas++;
            }
            if(sexo == 1){
                Hombres++;
            }else{
                Mujeres++;
            }
            suma+= salario;
        }

        int promedio = suma/empleados;

        System.out.println("La cantidad de hombres son  de " + Hombres + " y mujeres es de " + Mujeres);
        System.out.println("Cantidad de personas con salario mayor de 700: " + CantPersonas);
        System.out.println("Promedio salarial es de " + promedio);
    }
}