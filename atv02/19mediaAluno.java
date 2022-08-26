//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: Faça um programa na Linguagem Java que leia quatros valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,n4, media;

        System.out.println("Informe a 1º nota:");
        n1 = sc.nextInt();
        System.out.println("Informe a 2º nota:");
        n2 = sc.nextInt();
        System.out.println("Informe a 3º nota:");
        n3 = sc.nextInt();
        System.out.println("Informe a 4º nota:");
        n4 = sc.nextInt();

        media = (n1+n2+n3+n4)/4;
        if (media >= 7) {
          System.out.printf("Média = %d aluno foi aprovado", media);
          
        } else{
          System.out.printf("Média = %d aluno foi reprovado", media);

        }
    }
}