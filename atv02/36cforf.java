// . Faça um programa na Linguagem Java que apresente os valores de
// conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a
// contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
// programa deve apresentar os valores das duas temperaturas.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a temperatura em Celsius:");
    float celsius = sc.nextInt();

    float fahrenheit = (9* celsius +160)/5;
    
    System.out.println("A temperatura em Fahrenheit e de : " + fahrenheit + " graus");
  }
}
