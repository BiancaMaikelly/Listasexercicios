import java.util.ArrayList;

public class Exerciciolistaquatro5{
    public static void main(String[] args){
        ArrayList<String> numero = new ArrayList<>();
        numero.add("4");
        numero.add("8");
        numero.add("10");
        numero.add("A");
        numero.add("5");
        numero.add("6");
        numero.add("7");
        numero.add("2");
        numero.add("9");
        numero.add("3");
        numero.add("K");
        numero.add("Q");
        numero.add("J");
        ArrayList<String> nipe = new ArrayList<>();
        nipe.add("Ouro");
        nipe.add("Espadas");
        nipe.add("Paus");
        nipe.add("Copas");
        int aux=0;
        for(int i=0; i<=12; i++){
            if(i==12){
                if(aux<3){
                    aux++;
                    i=0;
                }
            }
            System.out.println(numero.get(i)+" "+nipe.get(aux));
        }        
    }
}