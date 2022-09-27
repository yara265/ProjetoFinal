package cardapio;


public class Produto {

    public double preco;
    
    public Produto (double preco){
        this.preco = preco;
        
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarProduto(){
        //System.out.println("Quantidade: " + quantidade + " Validade: " + validade + " Preço: " + preco);
    }

}
