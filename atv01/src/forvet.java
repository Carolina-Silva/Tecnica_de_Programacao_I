//utilizando vetores e for

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int vetA [] = {1,2,3,4,5};
        for (int i=0; i < vetA.length; i++) {
            System.out.printf("%d\n", vetA[i]);
        }
    }
}



// while e pós incremento
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetA [] = new int [5];
        int i = 0;
        System.out.println("Entrada de dados:");
        while (i< vetA.length){
            vetA[i++] = sc.nextInt();
            //vetA[i++]  pós incremento, intrução concluida adiciona 1 (++i pré incremento)
        }
        System.out.println("Saida de dados:");
        for (i=0; i < vetA.length; i++) {
            System.out.printf("%d\n", vetA[i]);
        }
    }
}

// ler vertor e mostrar ele ao contrario
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetA [] = new int [5];
        int i = 0;
        System.out.println("Entrada de dados:");
        while (i< vetA.length){
            vetA[i++] = sc.nextInt();
        }
        System.out.println("Saida de dados:");
        for (i = vetA.length - 1; i >= 0; i--) {
            System.out.printf("%d\n", vetA[i]);
        }
    }
}

// mostrar pares do vet
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vetA [] = new int [5];
        int i = 0;
        System.out.println("Entrada de dados:");
        while (i< vetA.length){
            vetA[i++] = sc.nextInt();
        }
        System.out.println("Saida de dados:");
        for (i=0; i < vetA.length; i++) {
            if (vetA[i] % 2 == 0){
                System.out.printf("e par: %d\n", vetA[i]);
            }
        }
    }
}


//Matriz le matrix 3x3 e apresenta 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[][] = new  int[3][3];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.printf(m[i][j] + "\t"); //\t tab tabulação
            }
            System.out.println("");
        }
    }
}

//cria matriz com diferente numero de colunas
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] p = new int[3][];
        //cria matriz com diferente numero de colunas
        for(int i = 0; i < 3; i++){
            p[i] = new int[i+1];
            for (int j = 0; j < p[i].length; j++){
                p[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < p.length; i++){
            for (int j = 0; j < p[i].length; j++){
                System.out.printf(p[i][j] + "\t"); //\t tab tabulacao
            }
            System.out.println("");
        }
    }
}
