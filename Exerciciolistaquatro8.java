import java.util.Scanner;
public class Exerciciolistaquatro8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int tam = 12;
        int temp[] = new int[tam];        
        int soma=0;
        int media=0;
        
        for(int i=0; i< tam; i++){
            System.out.println("Digite a temperatura do "+ (i+1) +"° mes:");
            temp[i] = scanner.nextInt();
            
            soma = soma + temp[i];
        
            media = soma/(i+1);
            if(i<12){
                System.out.println("A média parcial é: "+ media);
            }
        }
        scanner.close();
        
        System.out.println("A média final é: "+ media);
        

    }
}