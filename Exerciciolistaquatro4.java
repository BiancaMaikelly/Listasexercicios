import java.util.Scanner;
public class Exerciciolistaquatro4{
    public static void main(String[] args){

        final int tam = 10;
        Scanner scanner = new Scanner(System.in);
                
        int valor[] = new int[tam];

        

        for(int i=0; i< tam; i++){
            System.out.println("Digite o " + (i+1) + "° valor para o array: \n");
            valor[i] = scanner.nextInt();
            if (valor[i]%2==0){
                System.out.println(valor[i] + " esse numero é par");
            }
            else{
                System.out.println(valor[i] + " esse numero é impar");
            }
        }
        scanner.close();
        
        for(int i=0; i< tam; i++){
            if (valor[i]%2==0){
                System.out.println(valor[i] + " esse numero é par");
            }
            else{
                System.out.println(valor[i] + " esse numero é impar");
            }
        }
    }
}