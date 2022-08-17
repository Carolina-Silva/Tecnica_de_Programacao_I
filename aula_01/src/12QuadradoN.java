import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x, quad;
        
        System.out.print("Informe o numero: ");
        x = sc.nextInt();

        quad = x*x;

        System.out.printf("o numero %d ao quadrado e %d", x,quad); 
    }
} 