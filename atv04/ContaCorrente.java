public class ContaCorrente{
    int nr_ContaCorrente;
    String nm_Cliente;
    String nr_CPF;
    double vlr_Saldo;

    public void Depositar(double vlr_Deposito){
        vlr_Saldo = vlr_Saldo + vlr_Deposito;
    }
    public void Sacar(double vlr_saque){
        if (vlr_saque > vlr_Saldo){
            System.out.println("Saldo insufuciente");
        }else{
            vlr_Saldo = vlr_Saldo - vlr_saque;
        } 
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        Scanner sc = new Scanner(System.in);


        conta.nr_ContaCorrente = 100;
        conta.nm_Cliente = "João Silva";
        conta.nr_CPF = "25896314777";
        conta.vlr_Saldo = 256.55;

        System.out.println("Informe o valor a ser Depositado:");
        double vlrDeposito = sc.nextDouble();
        conta.Depositar(vlrDeposito);

        System.out.println("Informe o valor a ser Sacado:");
        double vlrSaque = sc.nextDouble();
        conta.Sacar(vlrSaque);
       
        System.out.printf("DADOS DA CONTA: \nCliente: %s\nConta N°: %d\nCPF: %s\nSaldo: R$ %.2f\n", conta.nm_Cliente, conta.nr_ContaCorrente, conta.nr_CPF, conta.vlr_Saldo);
     
    }
}