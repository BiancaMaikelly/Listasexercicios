import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exerciciolistatres2{
    public static void main(String[] args) {
        Scanner leitura2 = new Scanner(System.in);
         

        System.out.printf("Informe o Nome de Arquivo Texto:\n");
        String nome = leitura2.nextLine();

        System.out.printf("\nConteúdo do Arquivo Texto:\n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine();
            }
            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        leitura2.close();
        System.out.println();
    }
}