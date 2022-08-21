import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, x;
        
        System.out.print("Informe o valor de A: ");
        a = sc.nextInt();

        System.out.print("Informe o valor de B: ");
        b = sc.nextInt();

        x = a;
        a = b;
        b = x;

        System.out.printf("Depois da troca A = %d e B = %d", a,b); 
    }
}