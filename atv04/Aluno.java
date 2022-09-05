public class Aluno{
    String ra;
    String nm_Aluno;
    String endereco;
    String curso;

    public void consutarDados (){
        vlr_Saldo = vlr_Saldo + vlr_Deposito;
    }
    public void matricular(String vlr_saque){
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
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        aluno.ra = "1002465456";
        aluno.nm_Aluno = "João Silva";
        aluno.endereco = "Rua zyx n° 3, Diadema";

        System.out.println("Iniciar sua matricula: \nQual curso você vai fazer?");
        String curso = sc.nextLine();
        aluno.matricular(curso);

        System.out.println("Seus dados são:");
        
       
        System.out.printf("DADOS DA CONTA: \nCliente: %s\nConta N°: %d\nCPF: %s\nSaldo: R$ %.2f\n", conta.nm_Cliente, conta.nr_ContaCorrente, conta.nr_CPF, conta.vlr_Saldo);
     
    }
}