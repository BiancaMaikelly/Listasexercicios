import java.util.Scanner;

public class Exerciciolistadois9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        double imc = (peso / (altura * altura));
        
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + imc);

        if( imc < 18.5 ){
            System.out.println("Abaixo do Peso");
        }
        else if( imc < 18.6){
            System.out.println("Peso Ideal");
        }
        else if( imc > 25.0){
            System.out.println("Levemente Acima do Peso");
        }
        else if( imc > 30.0){
            System.out.println("Obesidade Grau I");
        }
        else if( imc > 35.0){
            System.out.println("Obesidade Grau II");
        }
        else if( imc > 40.0){
            System.out.println("Obesidade Grau III Mórbida");
        }
        scanner.close();
    }
}