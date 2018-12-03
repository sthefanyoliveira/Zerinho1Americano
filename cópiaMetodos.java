package zerinho1americano;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Thety
 */
public class Jogador {
    private int ID;
    
    
    public static int Adiciona(int x){
         Scanner input = new Scanner(System.in);
         int [] jogadores = new int[x];
         for(int i=0; i<jogadores.length; i++){
             jogadores[i] = input.nextInt();
             System.out.println(jogadores[i]); 
         } 
        return x;
}
    public static int SomaElementos(int[] jogadores){
         int soma = 0;
         for(int i=0; i<jogadores.length; i++){
         soma = soma+jogadores[i];
     }
         return soma;
    }
         
     public void Retira(int cont, int Jogadores[]){
         int j = 0;
         for(int i=0; i<Jogadores.length;i++){
             if(Jogadores[i] != cont){
                 j++;
             }
         int[] vetorAux = new int[j];
         int index = 0;
         for(int s=0;s<Jogadores.length; s++){
           if(Jogadores[s] != cont){
               vetorAux[index] = Jogadores[s];
               index++;
           }
       }
       Jogadores= vetorAux;
         }
     }
}