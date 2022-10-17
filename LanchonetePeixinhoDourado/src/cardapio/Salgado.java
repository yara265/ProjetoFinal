package cardapio;

public class Salgado extends Produto{
    
    public String sabor;
    public String tipo;
    public double preco;

    public Salgado(String sabor, String tipo) {
        super(5, "Salgado");
        this.preco = 5;
        this.sabor = sabor;
        this.tipo = tipo;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String mostrarProduto(){
        System.out.println("----------Produto-----------");
        return nome + " de " + sabor + ";  \nTipo: " + tipo + ";  \nValor: R$" + this.preco;
    }
    
}
