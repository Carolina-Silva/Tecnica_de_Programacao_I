//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo:Criar um vetor A do tipo inteiro de 5 elementos
// – Solicitar os valores para o usuário e inserir no vetor A
// – Criar um vetor B do tipo inteiro
// – Ler o vetor A e para cada elemento lido calcular o fatorial e gravar
// no B
// – Após de todos os elementos do vetor A, mostrar os dois vetores


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetA[] = new int[5];
        int vetB[] = new int[5];
        System.out.println("Informe 5 numeros para calcular o fatorial:");
        for (int i = 0; i < 5; i++){
            vetA[i] = sc.nextInt();
        }
        
        for (int i=0; i < vetA.length; i++) {
            int x = vetA[i];
            int f = x;
            while (x > 1){
                f = f * (x - 1);
                x--;
            }
            vetB[i] = f;
        } 

        System.out.println("VetA! = VetB:");
        for (int i=0; i < vetA.length; i++) {
            System.out.printf("%d!  = %d\n", vetA[i],vetB[i]);
        }
    }
}

//foi