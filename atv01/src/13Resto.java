import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x, resto;
        
        System.out.print("Informe o valor a ser dividido: ");
        x = sc.nextInt();

        resto = x % 6;

        System.out.printf("O resto da divicao de %d por 6 e %d", x,resto); 
    }
}