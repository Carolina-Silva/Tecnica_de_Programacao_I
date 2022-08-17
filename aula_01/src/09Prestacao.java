import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        float prest, valor, taxa;
        int tempo;

        System.out.println("Vamos calcular o valor de sua prestacao em atraso");

        System.out.print("Digite o valor da prestacao:");
        valor = sc.nextFloat();

        System.out.print("Digite a taxa: (%) ");
        taxa = sc.nextFloat();

        System.out.print("A quantos dias de atraso?");
        tempo = sc.nextInt();
        
        prest = valor + (valor * (taxa/100)* tempo);
        
        System.out.printf("O valor da prestacao agora e: R$%.2f", prest);
    }
}    