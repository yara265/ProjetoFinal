package pedidos;

import cardapio.Produto;
import java.io.Serializable;

public class Item implements Serializable {

    private final Produto produto;
    private int quantidade;

    public Item(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }

    public void addQuantidade() {
        this.quantidade += 1;
    }

    public void removeQuantidade() {
        if (this.quantidade > 0) {
            this.quantidade -= 1;
        } else {
            throw new IllegalStateException("A quantidade não pode ser menor que zero.");
        }
    }

    public double getPreco() {
        return this.produto.getPreco();
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String mostrar() {
        return this.produto.mostrarProduto();
    }

    @Override
    public String toString() {
        return this.produto.mostrarProduto();
    }
}
