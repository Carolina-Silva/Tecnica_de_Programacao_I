import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos Calcular a area do circulo");
        double n, r, a;
        n = 3.14159;
        System.out.println("Informe o raio do circulo");
        r = sc.nextDouble();
        a = n * (r*r);
        System.out.printf("Area = %.4f\n", a);
    }
}