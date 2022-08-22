//Faça um programa na Linguagem Java que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Entre com um numero:");
        n = sc.nextInt();
            if (n % 2 == 0){
                System.out.printf("O numero %d é par\n", n);
            }else{
              System.out.printf("O numero %d é ímpar\n", n);
            }
    }
}
