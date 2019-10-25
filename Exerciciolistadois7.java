import java.util.Scanner;

public class Exerciciolistadois7{
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        double nota1, soma = 0;
        int cont = 0;
        
        System.out.println("Entra com uma nota negativa para encerrar o problema");

        do{
            System.out.println("Digite uma nota");
            nota1 = nota.nextDouble(); 
            if(nota1 >= 0){ 
                soma = nota1 + soma; 
                cont++; 
            }
        } while(nota1 >= 0); 
        
        System.out.println("A média é " + soma / cont); 
        nota.close();
    }
}
    