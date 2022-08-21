//Nome: Carolina Nascimento Silva
//Ra: 
//Objetivo: receba 2 números e apresente a multiplicação dos dois números
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Valor 1:");
      int valor1 = sc.nextInt();

      System.out.println("Valor 2:");
      int valor2 = sc.nextInt();

      int multiplicacao = valor1 * valor2;

      System.out.println("O valor da Multiplicacao e:  " + multiplicacao);
    }
  }
} 