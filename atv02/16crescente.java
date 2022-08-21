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
        for (i=0; i < vet.length; i++) {
            System.out.printf(" d%\n", vet[i]);
        }
    }
}
//ERROR FORMAT JAVA NA SAIDA DE DADOS

