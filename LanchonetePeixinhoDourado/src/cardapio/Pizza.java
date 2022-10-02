package cardapio;

public class Pizza extends Produto{
    
    public String recheio;
    public boolean borda;
    
    public Pizza(double preco, String recheio, boolean borda) {
        super(preco, "Pizza");
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
        System.out.println("----------Produto-----------");
        return (nome + " de " + recheio + "\nValor:R$" + preco);
        
    }
    
}
