package cardapio;
import cardapio.Produto;
import cardapio.Disponivel;
import java.util.ArrayList;

public class Cardapio {
    ArrayList<cardapio.Produto> cardComida = new ArrayList<cardapio.Produto>();

    public Cardapio(){
        
    }

    public void addProduto(Produto comida){
        cardComida.add(comida);
    }

    public void mostrarCardapio(){
        System.out.println("----------------Cardápio----------------");
        for(int i = 0; i < cardComida.size(); i++){
            System.out.println(cardComida.get(i).mostrarProduto());
        }
        Disponivel.mostrarFrutasDisponiveis();
        Disponivel.mostrarMolhoDisponiveis();
        Disponivel.mostrarPaesDisponiveis();
        Disponivel.mostrarRecheioDisponiveis();
    }
}
