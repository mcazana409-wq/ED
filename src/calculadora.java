import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        int opcion;

        do{
            System.out.println("OPCION: ");
            opcion = sc.nextInt();
            int resultado =0;
            if(opcion== 5 ){
                break;
            }
            if (opcion<1 || opcion>5){
                System.out.println("Opncion no valida");
                continue;
            }
            System.out.println("NUMERO 1: ");
            int num1 = sc.nextInt();
            System.out.println("NUMERO 2: ");
            int num2 = sc.nextInt();
            int resuldado;
            if (opcion == 1){ // SUMAR
                resuldado = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + resuldado);

            } else if (opcion == 2) {//RESTAR
                resuldado = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + resuldado);

            } else if (opcion == 3) {//MULTIPLICAR
                for(int i = 0; i < num2; i++);
                resultado += num1;{

                }System.out.println(num1+ "*"+ num2+"="+ resultado);
            }else if(opcion == 4){//DIVISION
                if(num2 == 0){
                    System.out.println("No se puede dividir entre 0");
                }else {
                    resuldado = num1 / num2;
                    System.out.println(num1+ "/"+ num2+ "="+ resuldado);
                }
            }


        }while (opcion !=5);
        sc.close();

    }
}
