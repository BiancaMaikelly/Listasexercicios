import java.util.Scanner;
 
public class Exercicio12{
    public static void main(String[] args) {
        Scanner roubo= new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = roubo.nextDouble();
 
        if(salario<=1903.98){
            System.out.println("Isento");
        }
        else if(salario > 1903.99 && salario <= 2826.65){
            System.out.println("Imposto de 7.5%");
        }
        else if(salario> 2826.66 && salario <= 3751.05){
            System.out.println("Imposto de 15%");
        }
        else if(salario> 3751.06 && salario <=4664.68){
            System.out.println("Imposto de 22.5%");
        }
        else if(salario> 4664.69){
            System.out.println("Imposto de 27.5");
        }
        roubo.close();
    }
}