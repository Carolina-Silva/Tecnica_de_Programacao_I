//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: Fazer um procedimento para receber as notas da primeira e da segunda
// prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em
// vetores distintos. Calcular e escrever a média de cada aluno.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetA[] = new int[5];
        int vetB[] = new int[5];
        System.out.println("Informe as notas dos alunos na primeira prova:");
        for (int i = 0; i < 5; i++){
            vetA[i] = sc.nextInt();
        }
        System.out.println("Agora da segunda prova:");
        for (int i = 0; i < 5; i++){
            vetB[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            int m = (vetB[i] + vetA[i]) /2;
            System.out.printf("A média do aluno %d é : %d\n", (i+1), m );
        }
    }
}
