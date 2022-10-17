package cardapio;

public class Pizza extends Produto{
    
    public String recheio;
    public boolean borda;
    public double preco;
    
    public Pizza(String recheio, boolean borda) {
        super(50, "Pizza");
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
        System.out.println(this.nome+ this.recheio +"---------------R$"+preco);
        return (this.nome + " de " + this.recheio);
        
    }
    
}
