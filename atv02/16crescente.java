//16. Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente.

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vet [] = new int [3];
        int i = 0;
        System.out.println("Entre com os valores:");
        while (i< vet.length){
            vet[i++] = sc.nextInt();
        }
        Arrays.sort(vet);
        System.out.println("Saida em ordem crescente:");
        for (int i=0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}

///foiii