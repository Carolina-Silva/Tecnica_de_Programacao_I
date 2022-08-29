// . Criar uma coleção na linguagem Javacom 10 elementos
// – Inserir os elementos de 1 a 10 no vetor
// – Após a inserção, somente após a inserção mostrar o vetor.
// Obs. Não efetuar a leitura de 10 elementos
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         Random ran = new Random();
        int vet[] = new int[10];
        for (int i = 0; i < 10; i++){
            vet[i] = ran.nextInt(10);
        }
        System.out.println("Saida de dados:");
        for (int i=0; i < vet.length; i++) {
            System.out.printf("%d\n", vet[i]);
        }
    }
}