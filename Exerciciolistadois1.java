import java.util.Scanner;
 
public class Exerciciolistadois1{
    public static void main(String[] args){
        Scanner nota = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double nota1 = nota.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = nota.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = nota.nextDouble();
 
        double media = ((nota1 + nota2 + nota3) /3);
 
        if ( media > 7.0){
            System.out.println("Média Aprovada " + media);
        }
        else if(media < 7.0){
            System.out.println("Média Reprovada " + media);
        }
        nota.close();
    }


}