package lanchonetepeixinhodourado;
import java.util.ArrayList;

import cardapio.*;
import pedidos.FormaDePagamento;
import pedidos.Item;
import pedidos.Pedido;
import pedidos.Serializacao;
import pedidos.Venda;
public class LanchonetePeixinhoDourado {

    public static void main(String[] args) {
          
        //Atividade 4 - classes
        //instanciando ingrediente disponiveis
        Disponivel banana = new Disponivel("Banana", "Fruta");
        Disponivel morango = new Disponivel("Morango", "Fruta");
        Disponivel frances = new Disponivel("Pão Frances", "Pao");
        Disponivel hamburger = new Disponivel("Hamburger", "Pao");
        Disponivel maionese = new Disponivel("Maionese", "Molho");
        Disponivel ketchup = new Disponivel("ketchup", "Molho");
        Disponivel recheio = new Disponivel("Patê de atum", "Recheio");
        Disponivel queijo = new Disponivel("Queijo", "Recheio");
        Disponivel presunto = new Disponivel("Presunto", "Recheio");

        //metodo para mostrar os ingredientes disponiveis
        //Disponivel.mostrarFrutasDisponiveis();
        //Disponivel.mostrarMolhoDisponiveis();
        //Disponivel.mostrarPaesDisponiveis();
        //Disponivel.mostrarRecheioDisponiveis();
        // System.out.println("-----------------------------------------------------------------------------------------------");
        //instanciando produtos
        Pizza pizza = new Pizza("Portuguesa", false);
        Refrigerante refrigerante = new Refrigerante(8, "Fanta Uva", 1000);
        Salgado salgado = new Salgado(5, "Salsicha", "Frito");
        Vitamina vitamina = new Vitamina(morango, false, 500);
        Sanduiche sanduiche = new Sanduiche(12, queijo, hamburger, maionese);

        //Aqui é adicionado e mostrado o Produto
        // Cardapio cardapio = new Cardapio();
        // cardapio.addProduto(pizza);
        // cardapio.mostrarCardapio();
        // System.out.println("-----------------------------------------------------------------------------------------------");
        
        
        //cada produto é um item
        Item i1 = new Item(pizza);
        Item i2 = new Item(refrigerante);
        Item i3 = new Item(salgado);
        Item i4 = new Item(vitamina);
        //criando pedido
        Pedido Pedido1 = new Pedido("Alexandro",FormaDePagamento.dinheiro);
        //adicionando itens ao pedido
        Pedido1.addItem(i1);
        Pedido1.addItem(i4);
        Pedido1.addItem(i2);
        //metodo de mostrar o pedido
        // Pedido1.mostrarPedido();
        // System.out.println("-----------------------------------------------------------------------------------------------");
        //metodo para finalizar pedido
        // Venda v1 = Pedido1.finalizarPedido();
        // Serializacao.writeFile(v1);
        
        ArrayList<Venda> vendas = Serializacao.readFile();
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
        
    
    }
}
