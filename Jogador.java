/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zerinho1americano;
import java.util.Scanner;

/**
 *
 * @author Thety
 */
public class Jogador {
    private int ID;
    private Partida part;

    Scanner scan;    

    public void Partida EntraPartida(Partida part){
         
}

    public void JogaValor(int x){
        System.out.Println("Insira qualquer valor de 0 a 10");
        scan = new Scanner(System.in);
        x = scan.nextInt();

    }

    public void verResultado(Partida p){
        System.out.Println("visualizar resultado");
        

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