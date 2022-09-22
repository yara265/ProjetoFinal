package Cardapio;

public class Vitamina extends Produto{
    
    public String sabor;
    public boolean acucar;
    public double volume;
    
    public Vitamina(double preco, String validade, int quantidade, String sabor, boolean acucar, double volume) {
        super(preco, validade, quantidade);
        this.sabor = sabor;
        this.acucar = acucar;
        this.volume = volume;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setAcucar(boolean acucar) {
        this.acucar = acucar;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    
}
