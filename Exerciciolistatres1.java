import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exerciciolistatres1{
    public static void main(String[] args) throws IOException {
        Scanner tabtxt = new Scanner(System.in);

        int Num31; 
        int inicio31, fim31;

        System.out.println("Digite a Tabuada: ");
        Num31 = tabtxt.nextInt();
        System.out.println("Digite o inicio da tabuada: ");
        inicio31 = tabtxt.nextInt();
        System.out.println("Diga o fim da tabuada: ");
        fim31 = tabtxt.nextInt();

        FileWriter tabuada31 = new FileWriter("tabuada.txt");
        PrintWriter gravarArq31 = new PrintWriter(tabuada31);

        gravarArq31.printf("---Resultado---%n");
        for (int i = inicio31; i <= fim31; i++) {
            System.out.println(" " + Num31 + " x " + i + " = " + Num31 * i);

            gravarArq31.printf(" %2d X %d = %2d %n", Num31, i, (Num31 * i));
        }
        gravarArq31.close();

        tabtxt.close();
    }
}