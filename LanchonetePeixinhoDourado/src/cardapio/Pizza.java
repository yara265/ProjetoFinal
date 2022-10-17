package cardapio;

public class Pizza extends Produto{
    
    public String recheio;
    public boolean borda;
    public double preco;
    
    public Pizza(String recheio, boolean borda) {
        super(50, "Pizza");
        this.preco = 50;
        this.recheio = recheio;
        this.borda = false;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setBorda(boolean borda) {
        this.borda = true;
    }        
        
    
    @Override
    public String mostrarProduto(){
        return this.nome + " de " + this.recheio + ";  \nValor: R$" + this.preco;
        
    }
    
}
