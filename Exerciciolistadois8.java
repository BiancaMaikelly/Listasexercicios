import java.util.Scanner;

public class Exerciciolistadois8{
    public static void main(String[] args) {
        Scanner fatorial = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = fatorial.nextInt();
        int fat = 1; 

            for( int i = 2; i <= valor; i++ ){
                fat *= i;
            }
            System.out.println( "O fatorial de " + valor + " é igual a " + fat );
            fatorial.close();
    }
}