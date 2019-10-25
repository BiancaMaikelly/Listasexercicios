import java.util.Scanner;

public class Exerciciolistaquatro1{
    public static void main(String[] args){
        System.out.println("Fala a quantidade de notas");
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++){
            System.out.println("informe o "+ (i + 1) +" número");
            notas[i] = scanner.nextDouble();
        }

        
        
        scanner.close();


    }
}