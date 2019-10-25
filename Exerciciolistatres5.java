import java.util.HashSet;
import java.util.Scanner;

public class Exerciciolistatres5{
    public static void main(String[] args) {
        HashSet<String> hash5 = new HashSet<String>();
        Scanner ent5 = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º Nome: ");
            String aux = ent5.nextLine();
            hash5.add(aux);

        }
        System.out.println(hash5);
        ent5.close();
        hash5.clear();
    }
}