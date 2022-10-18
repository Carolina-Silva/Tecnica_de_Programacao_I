//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: Criar um projeto Java chamado “Heranca_01”, que implemente todo o código necessário para a criação das classes da atvidade 09 exercicio 75.
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
