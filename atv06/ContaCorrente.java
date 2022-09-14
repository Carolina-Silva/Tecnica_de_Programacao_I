public class ContaCorrente{
    private String nmCorrentista;
    private String sexo;
    private int idade;
    private String nrConta;
    private boolean contaConjunta;
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

    public boolean getContaConjunta() {
        return contaConjunta;
    }
    public void setContaConjunta(boolean contConju){
        contaConjunta = contConju;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    // public void Depositar(double vlr_Deposito){
    //     vlr_Saldo = vlr_Saldo + vlr_Deposito;
    // }
    // public void Sacar(double vlr_saque){
    //     if (vlr_saque > vlr_Saldo){
    //         System.out.println("Saldo insufuciente");
    //     }else{
    //         vlr_Saldo = vlr_Saldo - vlr_saque;
    //     } 
    // }


}