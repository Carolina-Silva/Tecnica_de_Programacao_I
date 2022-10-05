package Tecnica_de_Programacao_I.atv09;

public class heranca_01 {

    public class Funcionario{
        private String nome;
        private String cpf;
        private double salario;

        
    
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
    
        public String getCpf(){
            return cpf;
        }
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
    
        public double getSalario(){
            return salario;
        }
        public void setSalario(Double salario){
            this.salario = salario;
        }
    
    }
    
    public class Gerente extends Funcionario{
        private int senha;
    
        public boolean autenticar(int senha){
            if (this.senha == senha){
                return true;
            }
            return false;
        }
    }
    
}
