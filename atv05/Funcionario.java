public class Funcionario{
  String nome;
  double salarioBruto;
  double desconto;

  public double salarioLiquido(){
    return salarioBruto - desconto;
  }

  public void aumentarSalario(double porcentagem){
    salarioBruto = salarioBruto + (salarioBruto * (porcentagem/100)) ;
  }
}

import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Funcionario func = new Funcionario();
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o nome do Funcionário:");
    String nm =sc.nextLine();
    func.nome= nm;

    System.out.println("Salário Bruto:");
    double salBruto  =sc.nextDouble();
    func.salarioBruto= salBruto;

    System.out.println("Desconto:");
    double des  =sc.nextDouble();
    func.desconto= des;

    System.out.println("Deseja aumentar o salário em qual porcentagem?");
    double porcentagem  =sc.nextDouble();
    func.aumentarSalario(porcentagem);

    System.out.println("Dados do funcionário depois dos dencontos e aumento de salário");
    System.out.printf("NOME: %s\n SALÁRIO LIQUIDO: %.2f", func.nome, func.salarioLiquido());
  }
}