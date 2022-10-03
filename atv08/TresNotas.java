//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e o terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado ou não e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Aluno para resolver este problema
public class Aluno{
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public void aluno(){

    }
    public void aluno(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota2 = nota3;
    }
  
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getNota1(){
        return nota1;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
   
    public double getNota2(){
        return nota2;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
   
    public double getNota3(){
        return nota3;
    }
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
   
   
    public double calcularMedia(){
       return nota1 + nota2 + nota3;        
    }

    public double pontosFaltam(){
        if(calcularMedia() >= 60.00){
            return calcularMedia();
        } else{
            return 60.00 - calcularMedia(); 
        }
    }

    public String toString(){
        if(calcularMedia() >= 60.00){
            return "NOTA FINAL = " + calcularMedia() + "\nAPROVADO"; 
        }else{
            return "NOTA FINAL = " + calcularMedia() + "\nREPROVADO"+ "\nFALTARAM " + pontosFaltam() + " PONTOS"; 
        }
        
    }
}
 //teste para classe aluno
public class Main{
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        a1.setNome("João Pedro");
        a1.setNota1(27.00);
        a1.setNota2(31.00);
        a1.setNota3(32.00);
        
        a2.setNome("João Pedro");
        a2.setNota1(17.00);
        a2.setNota2(20.00);
        a2.setNota3(15.00);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}