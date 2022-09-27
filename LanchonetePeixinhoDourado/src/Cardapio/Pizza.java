package cardapio;

public class Pizza extends Produto{
    
    public String nome = "Pizza";
    public String recheio;
    public boolean borda;

    public Pizza(double preco, String recheio, boolean borda) {
        super(preco);
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
        System.out.println("Produto: " + nome + " de " + recheio + "\nPreço R$" + preco);
        //falta borda
    }
    
}
