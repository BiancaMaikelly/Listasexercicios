import java.util.Scanner;


public class Exerciciolistaquatro3{
    public static void main(String[] args){
        final int tam = 10;
        Scanner scanner = new Scanner(System.in);
        
        double valor[] = new double[tam];

        System.out.println("Digite os valores para o array: \n");
        
        for(int i=0; i< tam; i++){
            Double aux = scanner.nextDouble();
            if((aux>=0) && (aux<=10)){
                valor[i] = aux;
            }
            else{
                System.out.println("Nota invalida, favor digitar novamente: ");
                i--;
            }
        }
        scanner.close();
        System.out.println("Os valores feitos sao: \n");
        for (double value : valor) {
            
            System.out.println(value);
        
        }
    }
}