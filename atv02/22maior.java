//Faça um programa na Linguagem Java que leia 3 números inteiros e mostre o maior deles.

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
        System.out.printf("Maior número: %d",vet[2]);   
    }
}