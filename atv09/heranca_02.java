//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo:Criar um projeto Java chamado “Heranca_02”, que implemente todo o código necessário para a criação das classes da atvidade 09 exercicio 76.
public class heranca_02 {

    
    public class Veiculo{
        private String placa;
        private int ano;

        public Veiculo(){

        }
        public Veiculo(String placa, int ano){
            
        }
    
        public String getPlaca(){
            return placa;
        }
        public void setPlaca(String placa){
            this.placa = placa;
        }
        //SET ANO STRING????

        public int getAno(){
            return ano;
        }
        public void setAno(int ano){
            this.ano = ano;
        }

        public void exibirDados(){ //É VOID MESMO???
            
        }
    
    }
    
    public class Caminhao extends Veiculo{
        private int eixos;
    
        public boolean autenticar(int senha){
            if (this.senha == senha){
                return true;
            }
            return false;
        }

        @Override
        public void exibirDados(){

        }
    }

    public class Onibus extends Veiculo{
        private int senha;
    
        public boolean autenticar(int senha){
            if (this.senha == senha){
                return true;
            }
            return false;
        }

        @Override
        public void exibirDados(){

        }
    }
}
