package Cardapio;


public class Produto {

    public double preco;
    public String validade;
    public int quantidade;
    
    public Produto (double preco, String validade, int quantidade){
        this.preco = preco;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } 

    public void mostrarProduto(){
        //System.out.println("Quantidade: " + quantidade + " Validade: " + validade + " Preço: " + preco);
    }

}
