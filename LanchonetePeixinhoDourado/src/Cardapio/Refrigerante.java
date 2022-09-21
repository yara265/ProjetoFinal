package Cardapio;

public class Refrigerante extends Produto{
    
    public double preco;
    public String validade;
    public String sabor;
    public double volume;
    
    public Refrigerante (double preco, String validade, String sabor, double volume){
        super(preco, validade);
        this.sabor = sabor;
        this.volume = volume;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getValidade() {
        return validade;
    }

    public String getSabor() {
        return sabor;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    
}
