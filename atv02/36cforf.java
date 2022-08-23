// . Faça um programa na Linguagem Java que apresente os valores de
// conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a
// contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
// programa deve apresentar os valores das duas temperaturas.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float celsius,fahrenheit;
    System.out.println("Temperatura de Celsius para Fahrenheit:");
    celsius = 10;
    for (int i=0; i < 100; i= i + 10) {
      fahrenheit = (9* celsius +160)/5;
      System.out.printf("Celsius: %.2f Fahrenheit: %.2f\n",celsius, fahrenheit);
      celsius = celsius + 10;
    }  
  }
}