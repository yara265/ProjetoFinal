package cardap;
import java.util.ArrayList;

public class Cardapio {
    ArrayList<Produto> comidaCardapio = new ArrayList<Produto>();

    public void addProduto(Produto produto){
        for(int i = 0; i < comidaCardapio.size(); i++){
            comidaCardapio.add(produto);
        }
    }

    public void mostrarCardapio(){
        for(Produto comida: comidaCardapio){
            System.out.println(comida.mostrarProduto());
            // Produto.........Preco
            // tipos
        }
    }


}
