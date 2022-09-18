package ProjetoFinal;
import java.util.ArrayList;

public class Pedido {

    public ArrayList<Produto> produtos = new ArrayList<Produto>();
    public double preco = 0;
    
    public Pedido (){
    }
    
    public void adicionarPedido(Produto prod){
        produtos.add(prod);
        this.preco = this.preco + prod.getPreco();
    }
    
    public void retirarProduto(Produto prod){
        for (Produto i:produtos){
            if (prod==i){
                produtos.remove(i);
            }
        }
    }
}
