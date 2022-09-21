package Cardapio;

public class Sanduiche extends Produto{

    public double preco;
    public String validade;
    public String recheio;
    public String tipoDoPao;
    public String molho;
    
    public Sanduiche (double preco, String validade, String recheio, String tipoDoPao, String molho){
        super(preco, validade);
        this.recheio = recheio;
        this.tipoDoPao = tipoDoPao;
        this.molho = molho;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
    
    @Override
    public String getValidade() {
        return validade;
    }

    public String getRecheio() {
        return recheio;
    }

    public String getTipoDoPao() {
        return tipoDoPao;
    }

    public String getMolho() {
        return molho;
    }

    
    
    
}
