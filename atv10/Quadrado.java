public class Quadrado extends Retangulo {

    Quadrado(String cor , double lado) {
        super( cor, lado, lado); //passo lado para lado1 e lado2 
    }

    @Override
    public String toString() {
        String r = "";
        r = "Lado: " +  getlado1() + "\n"+"Area: " + area() + "\n" + "Cor: " + getCor();
        return r;
    }

    
}
