public class Exercicio5{
    public static void main(String[] args){
        int a = 10;
        int b = 40;
        int c = 5;

        int delta = (b * b) - (4 * a * c);

        double soma = (-b + Math.sqrt(delta)) / (2 * a);
        double subtracao = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("O valor de delta é: " + delta);
        System.out.println("O valor x' da bhaskara é: " + soma);
        System.out.println("O valor x'' da bhaskara é: " + subtracao);
        }
}