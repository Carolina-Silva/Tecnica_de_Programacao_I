public class Retangulo extends Figura{
    private double lado1;
    private double lado2;

    public Retangulo(String cor, double lado1, double lado2){
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setlado1(double lado1){
        this.lado1 = lado1;
    }
    public double getlado1(){
        return lado1;
    }

    public void setlado2(double lado2){
        this.lado2 = lado2;
    }
    public double getlado2(){
        return lado2;
    }

    @Override
    public double area(){
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        String r = "";
        r = "Lado1: " +  lado1 + "\n"+"Lado2: " +  lado2 + "\n" + "Area: " + area() + "\n" + "Cor: " + getCor();
        return r;
    }

    
}
