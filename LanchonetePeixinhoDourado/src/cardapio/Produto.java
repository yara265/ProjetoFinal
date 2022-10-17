package cardapio;

import java.io.Serializable;


public class Produto implements Serializable{

    public double preco;
    public String nome;
    
    public Produto (String nome){
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

    public void mostrarProdutos(){
        System.out.println(nome + "......................" + preco);
    }
}
