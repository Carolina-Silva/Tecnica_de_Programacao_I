// Nome: Carolina Nascimento Silva
//Ra: 
//Objetivo:e leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.

import java.util.Scanner;

public class CforF {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a temperatura em Celsius:");
    float celsius = sc.nextInt();

    float fahrenheit = (9* celsius +160)/5;
    
    System.out.println("A temperatura em Fahrenheit é de : " + fahrenheit + " graus");
  }
}