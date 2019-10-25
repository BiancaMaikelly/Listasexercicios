import java.util.Scanner;

public class Exerciciolistadois10{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora");
        int menu;
        double i,j,total;
         do{
        
            System.out.println("Escolha uma função");
            System.out.println(" 1 - SOMA");
            System.out.println(" 2 - SUBTRAÇÃO");
            System.out.println(" 3 - MULTIPLICAÇÃO");
            System.out.println(" 4 - DIVISÃO");
            System.out.println(" 5 - FINALIZAR");
            menu = entrada.nextInt();
        

            switch(menu){
                case 1 :
                System.out.println("Insira o primeiro valor");
                i = entrada.nextDouble();
                System.out.println("Insira o segundo valor");
                j = entrada.nextDouble();
                total = i + j;
                System.out.println("O resultado da soma é = " + total);
                break;
                case 2 :
                System.out.println("Insira o primeiro valor");
                i = entrada.nextDouble();
                System.out.println("Insira o segundo valor");
                j = entrada.nextDouble();
                total = i - j;
                System.out.println("O resultado da divisão é = " + total);
                break;
                case 3 :
                System.out.println("Insira o primeiro valor");
                i = entrada.nextDouble();
                System.out.println("Insira o segundo valor");
                j = entrada.nextDouble();
                total = i * j;
                System.out.println("O resultado da multiplicação é = "+total);
                break;
                case 4 :
                System.out.println("Insira o primeiro valor");
                i = entrada.nextDouble();
                System.out.println("Insira o segundo valor");
                j = entrada.nextDouble();
                total = i / j;
                System.out.println("O resultado da divisão é = "+total);
                break;
                case 5 :
                System.exit(0);
                default :
                System.out.println("O valor informado é inválido");
                break;
            }
        }while(menu>=0);entrada.close();
    }
}