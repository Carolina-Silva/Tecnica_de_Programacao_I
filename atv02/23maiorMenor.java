//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo:Faça um programa na Linguagem  Java  que efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vet [] = new int [5];
        System.out.println("Entre com os valores:");
        int i = 0;
        while (i< vet.length){
            vet[i++] = sc.nextInt();
        }
        
        int menor = vet[0];
        for (i = 0; i < vet.length; i++){
            if(menor >= vet[i]){
                menor = vet[i];
            }
        }
        
        int maior = vet[0];
        for (i = 0; i < vet.length; i++){
            if(maior <= vet[i]){
                maior = vet[i];
            }
        }
        
        System.out.print("Maior = ");
        System.out.print(maior);
        System.out.print("\nMenor = ");
        System.out.print(menor);
        
    }
}
