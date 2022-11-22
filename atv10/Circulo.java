public class Circulo extends Figura{
    private double raio;
    
    public Circulo(String cor, double raio){
        super(cor); //puxar de fugura
        this.raio = raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }

    @Override
    public double area(){
        return Math.PI * raio * raio;
    }

    public double getDiametro(){
        return 2 * raio;
    }

    @Override
    public String toString() {
        String r = "";
        r = "Raio: " +  raio + "\n"+"Diametro: " +  getDiametro() + "\n" + "Area: " + area()+ "\n" + "Cor: " + getCor();
        return r;
    }

    
}
