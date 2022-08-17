import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float dolar, cota, real;
        
        System.out.print("Para converter suas notas de dolar em real porfavor informe a quantidade em dolar: ");
        dolar = sc.nextFloat();

        System.out.print("Agora informe a cotacao de hoje: ");
        cota = sc.nextFloat();

        real = dolar * cota;

        System.out.printf("Na convercao voce tera R$%.2f em reais\n" , real);
    }
}    