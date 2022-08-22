// Faça um programa na Linguagem Java que que receba um número e
// mostre o fatorial desse número
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n, x;

    System.out.println("Informe o numero que deseja calcular o fatorial");
    n = sc.nextInt();

    while (x > 1){
      n = n *(x-1); x--;
   };
    System.out.printf("o fatorial de %f fatorial é: %f\n", n,x );

  }
}
