package Cardapio;

public class Pizza extends Produto{
    
    public String nome = "Pizza";
    public String recheio;
    public boolean borda;

    public Pizza(double preco, String validade, int quantidade, String recheio, boolean borda) {
        super(preco, validade, quantidade);
        this.recheio = recheio;
        this.borda = borda;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    @Override
    public void mostrarProduto(){
        System.out.println();
    }
    
}
