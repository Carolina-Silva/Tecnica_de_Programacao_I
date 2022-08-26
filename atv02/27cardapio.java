//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: O cardápio de uma lanchonete é o seguinte:
// Especificação -   Código - Preço
// Cachorro quente    100     1,20
// Bauru simples      101     1,30
// Bauru com ovo      102     1,50
// Hambúrger          103     1,20
// Cheeseburguer      104     1,30
// Refrigerante       105     1,00
// Faça um programa na Linguagem Java que leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item.
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cd, qt;
    double valor;
    System.out.println("Informe o código do lanche que você comprou:");
    cd = sc.nextInt();
    System.out.println("Agora por favor informe a quantidade:");
    qt = sc.nextInt();

    switch (cd) {
      case 100:
        valor = qt * 1.20;
        System.out.printf("Valor a pagar: R$ %.2f", valor);
       break;
      case 101:
        valor = qt * 1.30;
        System.out.printf("Valor a pagar: R$ %.2f", valor);
      case 102:
        valor = qt * 1.50;
        System.out.printf("Valor a pagar: R$ %.2f", valor);
      case 103:
        valor = qt * 1.20;
        System.out.printf("Valor a pagar: R$ %.2f", valor);
      case 104:
        valor = qt * 1.30;
        System.out.printf("Valor a pagar: R$ %.2f", valor);
      case 105:
        valor = qt * 1.00;
        System.out.printf("Valor a pagar: R$ %.2f", valor);

      default:
        System.out.println("Código invalido");
    }
  } 
}

// codigo invalido junto com case 105