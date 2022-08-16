// Nome: Carolina Nascimento Silva
//Ra: 
//Objetivo:e leia uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.

import java.util.Scanner;

public class FforC {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a temperatura em Fahrenheit:");
    float fahrenheit = sc.nextInt();

    float celsius = (fahrenheit - 32)*5/9;
    
    System.out.println("A temperatura em Celsius é de : " + celsius + " graus");
  }
}
