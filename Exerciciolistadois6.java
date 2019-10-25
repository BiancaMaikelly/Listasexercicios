public class Exerciciolistadois6 {
    public static void main(String []args) {
 
        int i = 0;
        int resultado = 0;
    
        for(i=0;i<=500;i++){
            if((i %2 == 1 ) && (i % 7 == 0)){
                resultado = i + resultado;
            }
        
        }   
 
        System.out.println(resultado);
    }   
}