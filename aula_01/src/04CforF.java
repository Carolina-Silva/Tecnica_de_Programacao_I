// Nome: Carolina Nascimento Silva
//Ra: 
//Objetivo:e leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.

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