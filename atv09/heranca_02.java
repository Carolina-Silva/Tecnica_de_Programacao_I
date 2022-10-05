package Tecnica_de_Programacao_I.atv09;

public class heranca_02 {

    
    public class Veiculo{
        private String placa;
        private int ano;
    
        public String getPlaca(){
            return placa;
        }
        public void setPlaca(String placa){
            this.placa = placa;
        }

        public int getAno(){
            return ano;
        }
        public void setAno(int ano){
            this.ano = ano;
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
    }

    public class Onibus extends Veiculo{
        private int senha;
    
        public boolean autenticar(int senha){
            if (this.senha == senha){
                return true;
            }
            return false;
        }
    }
}
