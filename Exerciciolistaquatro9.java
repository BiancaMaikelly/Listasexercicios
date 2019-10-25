/*Incompleto*/
import java.util.Scanner;

public class Exerciciolistaquatro9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int tam = 1;
        int vet[] = new int[tam];
        int arr[] = new int[tam];
        
        
        for(int i=0; i< tam; i++){
            System.out.println("Digite " + (i+1) +"° valor pro array um:");
            vet[i] = scanner.nextInt();
            }
        for(int i=0; i< tam; i++){
            System.out.println("Digite " + (i+1) +"° valor pro array um:");
            arr[i] = scanner.nextInt();
        }
        int mer[] = new int[tam*2];
        int k=0;
        for(int i=0; i<(tam*2); i++){
            mer[i]=vet[k];
            i++;
            mer[i]=arr[k];
            k++;
        }
        scanner.close();
    }
}