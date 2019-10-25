import java.util.Scanner;

public class Exerciciolistatres4{
    public static void main(String[] args) {
        Scanner ent4 = new Scanner(System.in);


        System.out.println("Digite o Número: ");
        int num4 = ent4.nextInt();
        System.out.println("Digite o Expoente: ");
        int exp4 = ent4.nextInt();

        double result4 = Math.pow(num4, exp4);

        System.out.println("\nO Número: " + num4);
        System.out.println("Elevado ao Expoente: " + exp4);
        System.out.println("É Igual á: " + result4 + "\n");
        ent4.close();
    }
}