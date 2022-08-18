//Nome: Carolina Nascimento Silva
//Ra: 2171392211001
//Objetivo: receba 2 números e apresente a multiplicação dos dois números
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          
        String dtnas, dthoje;//cria variaveis das datas 

        System.out.print("Data do seu nascimento: (dd/mm/aaaa) ");
        dtnas = sc.nextLine(); 

        System.out.print("Data de hoje: (dd/mm/aaaa) ");
        dthoje = sc.nextLine();//guarda variaveis como string

        String[] dataSeparada = dtnas.split("/");
        LocalDate dtinicio = LocalDate.of(Integer.parseInt(dataSeparada[2]), Integer.parseInt(dataSeparada[1]), Integer.parseInt(dataSeparada[0]));

        String[] dataSeparada1 = dthoje.split("/");//transforma variaveis em array
        LocalDate dtfim = LocalDate.of(Integer.parseInt(dataSeparada1[2]), Integer.parseInt(dataSeparada1[1]), Integer.parseInt(dataSeparada1[0]));  //pega pelo index os elementos do array e passa eles para formato de data. 
        //LocalDate dtfim = LocalDate.now();

        long dias = ChronoUnit.DAYS.between(dtinicio, dtfim); // cria variavel de dias tipo long e calcula a diferenca entre as datas 
        System.out.println("Voce vive ha:  " + dias + " dias");

    }
}
