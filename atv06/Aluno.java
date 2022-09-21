//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: Criar classe aluno com atributos: nome,matricula, notas 1 e 2, e nota de reavaliação. Deve ter getters e setters e os metodos de caucular media e media com a reavaliação
public class Aluno{
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaReavaliacao;

    public Aluno(){

    }
    public Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;
    }
  
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
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
   
    public double getNotaReavaliacao(){
        return notaReavaliacao;
    }
    public void setNotaReavaliacao(double notaReavaliacao){
        this.notaReavaliacao = notaReavaliacao;
    }

   
    public double calcularMedia(){
       return (nota1 + nota2)/2;        
    }

    public double calcularMediaFinal(){
        if(calcularMedia() >= 6){
            return calcularMedia();
        } else{
            return (calcularMedia() + notaReavaliacao)/2;
        }
    }

    public String toString(){
        return "Nome: " + getNome() + "\nMatrícula: " + getMatricula() + "\nNota1: " + getNota1() + "\nNota2: "+ getNota2() + "\nMédia Final: " + calcularMediaFinal();
    }
}
public class TestaAluno{
    public static void main(String[] args){
        Aluno a1 = new Aluno("Maria","123456789",2.0,5.0,6.0);

        System.out.println(a1.toString());
    }
}