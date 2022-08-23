// . Faça um programa na Linguagem Java para apresentar o total da soma
// obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100)
public class Main {
    public static void main(String[] args) {
        int i, x;
        i = 1;
        x= 0;
        while (i <= 100){
            x = x + i;
            i++;
        }

        System.out.printf("Soma dos cem primeiros números inteiros: %d", x);
    }
  
}



// foiii