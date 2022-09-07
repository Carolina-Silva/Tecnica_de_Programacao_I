public class CalcRetangulo{
  double largura;
  double altura;

  public double area(){
    return largura * altura; 
  }

  public double perimetro(){
    return 2 * (largura + altura);
  }

  public double diagonal(){
    return Math.sqrt(Math.pow(altura,2) + Math.pow(largura,2));
  }
}

import java.util.Scanner;
class Main{
  public static void main(String[] args){
    CalcRetangulo ret = new CalcRetangulo();
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a largura do seu Triângulo:");
    double larg = sc.nextDouble();
    ret.largura = larg; 

    System.out.println("Informe a altura do seu Triângulo:");
    double alt = sc.nextDouble();
    ret.altura = alt;
    
    System.out.printf("AREA= %.2f\nPERIMETRO= %.2f\nDIAGONAL= %.2f", ret.area(), ret.perimetro(), ret.diagonal());
  }
}



