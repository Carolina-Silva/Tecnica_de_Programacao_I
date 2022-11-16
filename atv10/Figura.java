abstract class Figura{
    private String cor;

    Figura(String cor){
        this.cor = cor;
        
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public abstract double area();
    
    @Override
    public String toString(){
        return "Figura: \nCor: " + cor;
    }

}