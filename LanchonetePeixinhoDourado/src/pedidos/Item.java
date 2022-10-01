package pedidos;
import cardapio.Produto;

public class Item {

    public Produto produto;
    public int quantidade;
    
    public Item(Produto produto){
        this.produto = produto;
        this.quantidade = 1;
    }
    
    public void addQuantidade(){
        this.quantidade+=1;
    }
    
    public void removeQuantidade(){
        if (this.quantidade > 0){
            this.quantidade-=1;
        }
        else{
            
        }
    }

    double getPreco() {
        return this.produto.getPreco();
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public String mostrar(){
        return this.produto.mostrarProduto();
    }
    
    @Override
    public String toString() {
        return "produto: " + this.produto.nome + ", quantidade: " + quantidade + "\n" + "--------------------------";
    }

    
    
}
