package cardapio;

public class Pizza extends Produto{
    
    public String nome = "Pizza";
    public String recheio;
    public boolean borda;
    
    public Pizza(double preco, String recheio, boolean borda) {
        super(preco, "Pizza");
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
    public String mostrarProduto(){
        return (nome + " de " + recheio);
        //falta borda
    }
    
}
