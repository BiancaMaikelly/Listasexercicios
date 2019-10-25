public class Exerciciolistatres3{
    public static void main(String[] args) {

        int valor1 = Integer.parseInt(args[0]);
        int valor2 = Integer.parseInt(args[1]);
        int resultado = 0;

        resultado = valor1 + valor2;
        System.out.println(resultado);
        
        resultado = valor1 - valor2;
        System.out.println(resultado);

        resultado = valor1 * valor2;
        System.out.println(resultado);

        resultado = valor1 / valor2;
        System.out.println(resultado);
    }
}