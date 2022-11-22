//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo:Criar um projeto Java chamado “Heranca_02”, que implemente todo o código necessário para a criação das classes da atvidade 09 exercicio 76.
public class heranca_02 {

    
    public class Veiculo{
        private String placa;
        private int ano;

        public Veiculo(){
            this("",0);

        }
        public Veiculo(String placa, int ano){
            this.placa = placa;
            this.ano = ano;
        }
    
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

        public void exibirDados(){
            System.out.printf("DADOS DO VEICULO: \nPlaca: %s\nAno: %d", placa, ano);
        }
    
    }
    
    public class Caminhao extends Veiculo{
        private int eixos;
    
        public Caminhao(String placa, int ano, int eixos){
            super(placa, ano);
            this.eixos = eixos;
        }

        public int getEixo(){
            return eixos;
        }
        public void setEixo(int eixos){
            this.eixos = eixos;
        }

        @Override
        public void exibirDados(){
            System.out.printf("DADOS DO VEICULO: \nPlaca: %s\nAno: %d\n eixos: %d", placa, ano, eixos);

        }
    }

    public class Onibus extends Veiculo{
        private int assentos;

        public Onibus(String placa, int ano, int assentos){
            super(placa, ano);
            this.assentos = assentos;
        }

        public int getAssentos(){
            return assentos;
        }
        public void setAssentos(int assentos){
            this.assentos = assentos;
        }
    
        
        @Override
        public void exibirDados(){
            System.out.printf("DADOS DO VEICULO: \nPlaca: %s\nAno: %d\n Assentos: %d", placa, ano, assentos);

        }
    }
}
