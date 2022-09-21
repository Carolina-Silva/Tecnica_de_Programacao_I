//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: Criar classe Conta Corrente com atributos: nome, sexo idade, n° da conta, se é conjunta ou não e o saldo. Deve ter getters e setters e metodos de sacar ver saldo depositar
public class ContaCorrente{
    private String nmCorrentista;
    private String sexo;
    private int idade;
    private String nrConta;
    private String contaConjunta;
    private double saldo;

    public String getNmCorrentista(){
        return nmCorrentista;
    }
    public void setNmCorrentista(String nome) {
        nmCorrentista = nome;
    }
    
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNrConta(){
        return nrConta;
    }
    public void setNrConta(String numeroConta){
        nrConta = numeroConta;
    }

    public String getContaConjunta() {
        return contaConjunta;
    }
    public void setContaConjunta(String contConju){
        contaConjunta = contConju;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double vlr_saque){
        if (vlr_saque > vlr_Saldo){
            System.out.println("Saldo insufuciente");
        }else{
            vlr_Saldo = vlr_Saldo - vlr_saque;
        } 
    }

    public String verSaldo(){
        System.out.printf("DADOS DA CONTA\nNOME: %d\nN°: %d\nCONTA CONJUNTA? %d\nSALDO: %f", nmCorrentista,numeroConta,contaConjunta,saldo);
    }

    public void depositar(double vlrDeposito){
        saldo = saldo + vlrDeposito;
    }
}
import java.util.Scanner;
public class TestaConta{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        ContaCorrente  c1 = new ContaCorrente();
        ContaCorrente  c2 = new ContaCorrente();
        ContaCorrente  c3 = new ContaCorrente();

        c1.setNmCorrentista("Fernando");
        c1.setNrConta("1234");
        c1.setContaConjunta("Nao");
        c1.setSaldo(1500.00);
        c1.setSexo("masculino");
        c1.setIdade(29);

        c2.setNmCorrentista("Maria");
        c2.setNrConta("5321");
        c2.setContaConjunta("Sim");
        c2.setSaldo(530.31);
        c2.setSexo("Feminino");
        c2.setIdade(45);

        c3.setNmCorrentista("Joao");
        c3.setNrConta("9621");
        c3.setContaConjunta("Sim");
        c3.setSaldo(4325.12);
        c3.setSexo("masculino");
        c3.setIdade(54);

        c1.verSaldo();
        c2.verSaldo();
        c3.verSaldo();
    }
}