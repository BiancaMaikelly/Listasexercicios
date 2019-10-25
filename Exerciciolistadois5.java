import java.util.Scanner;
 
public class Exerciciolistadois5{
    public static void main(String []args) {
 
    System.out.println("Digite a palavra desejada: ");
    Scanner entrada = new Scanner(System.in);
    
    int i = 0;
    
    String palavra = entrada.nextLine();
    entrada.close();
    
    int qtd = palavra.length();
 
    for(i=0;i<qtd;i++){
    System.out.println(palavra.charAt(i));   
    }
    }
}