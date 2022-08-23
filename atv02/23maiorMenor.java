//. Faça um programa na Linguagem Java que efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.
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

//ajudaaaaa sem ordenação
