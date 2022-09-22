package Cardapio;

public class Salgado extends Produto{
    
    public String nome = "Salgado";
    public String sabor;
    public String tipo;
    
    public Salgado(double preco, String validade, int quantidade, String sabor, String tipo) {
        super(preco, validade, quantidade);
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
    public void mostrarProduto(){
        System.out.println();
    }
    
}
