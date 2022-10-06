package cardapio;

import java.io.Serializable;


public class Produto implements Serializable{

    public double preco;
    public String nome;
    
    public Produto (double preco, String nome){
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String mostrarProduto(){
        return (nome + "......................" + preco);
    }

}
