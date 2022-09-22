package Cardapio;

public class Refrigerante extends Produto{
    
    public String sabor;
    public double volume;
    
    public Refrigerante(double preco, String validade, int quantidade, String sabor, double volume) {
        super(preco, validade, quantidade);
        this.sabor = sabor;
        this.volume = volume;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    
}
