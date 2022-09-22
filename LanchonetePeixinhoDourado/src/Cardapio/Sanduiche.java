package Cardapio;

public class Sanduiche extends Produto{

    public String recheio;
    public String tipoDoPao;
    public String molho;
    
    public Sanduiche(double preco, String validade, int quantidade, String recheio, String tipoDoPao, String molho) {
        super(preco, validade, quantidade);
        this.recheio = recheio;
        this.tipoDoPao = tipoDoPao;
        this.molho = molho;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setTipoDoPao(String tipoDoPao) {
        this.tipoDoPao = tipoDoPao;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
    
    
    
}
