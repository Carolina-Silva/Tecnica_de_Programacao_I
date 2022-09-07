public class Aluno{
    String ra;
    String nm_Aluno;
    String endereco;
    String curso;

    public String consutarCurso (){
        return curso;
    }
    public void matricular(String matri_curso){
        curso = matri_curso;
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
        String matri_curso = sc.nextLine();
        aluno.matricular(matri_curso);

        System.out.println("Seus dados são:");
        System.out.printf("ALUNO: %s\nRA: %s\nCURSO: %s\nENDEREÇO: %s\n", aluno.nm_Aluno, aluno.ra, aluno.consutarCurso(), aluno.endereco);
    }
}