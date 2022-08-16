import java.util.Scanner;

public class Volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o raio da lata (em cm): ");
        float raio = sc.nextFloat();
        
        System.out.println("Informe a altura da lata (em cm): ");
        float altura = sc.nextFloat();
        
        double volume = 3.14159 * (raio*raio) * altura;
        
        System.out.println("o Volume da lata de oleo e: " + volume);
        
        
    }
}