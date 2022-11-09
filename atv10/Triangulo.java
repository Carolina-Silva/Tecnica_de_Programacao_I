class Triangulo extends Figura{
    private double base;
    private double altura;

    Triangulo(double base, double altura, String cor){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    public double area(){
        return base * altura /2;
    }

    @Override
    public String toString() {
        String r = "";
        r = "Base: " +  base + "\n"+"Altura: " +  altura + "\n" + "Area: " + area();
        return r;
    }

    
}
