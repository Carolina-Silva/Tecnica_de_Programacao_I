//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: Criar uma coleção “A” na linguagem Javacom 10 elementos
// – Inserir os elementos de 1 a 10 na coleção
// – Criar uma outra coleção B que conterá o elemento da coleção A
// multiplicado por 2
// – Mostrar as duas coleções
// Obs. Não efetuar a leitura de 10 elementos


import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         Random ran = new Random();
        int vetA[] = new int[10];
        int vetB[] = new int[10];
        for (int i = 0; i < 10; i++){
            vetA[i] = ran.nextInt(10);
        }
        for (int i = 0; i < 10; i++){
            vetB[i] = vetA[i] * 2;
        }

        System.out.println("VetA x VetB:");
        for (int i=0; i < vet.length; i++) {
            System.out.printf("%d X 2 = %d\n", vetA[i],vetB[i]);
        }
    }
}
