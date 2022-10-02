package lanchonetepeixinhodourado;
import cardapio.*;
import pedidos.FormaDePagamento;
import pedidos.Item;
import pedidos.Pedido;

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
        Disponivel.mostrarFrutasDisponiveis();
        Disponivel.mostrarMolhoDisponiveis();
        Disponivel.mostrarPaesDisponiveis();
        Disponivel.mostrarRecheioDisponiveis();
        System.out.println("-----------------------------------------------------------------------------------------------");
        //instanciando produtos
        Pizza pizza = new Pizza(33, "Portuguesa", false);
        Refrigerante refrigerante = new Refrigerante(8, "Fanta Uva", 1000);
        Salgado salgado = new Salgado(5, "Salsicha", "Frito");
        Vitamina vitamina = new Vitamina(11, morango, false, 500);
        Sanduiche sanduiche = new Sanduiche(12, queijo, hamburger, maionese);

        //Metodo Mostrar para mostrar o produto de forma individual
        System.out.println(pizza.mostrarProduto()); 
        System.out.println(refrigerante.mostrarProduto());
        System.out.println(salgado.mostrarProduto());
        System.out.println(vitamina.mostrarProduto());
        System.out.println(sanduiche.mostrarProduto());
        System.out.println("-----------------------------------------------------------------------------------------------");
        
        
        ////Cardapio
        //Cardapio cardapio = new Cardapio();
        ////metodo de adicionar produtos ao cardapio
        //cardapio.addProduto(pizza);
        //cardapio.addProduto(refrigerante);
        //cardapio.addProduto(salgado);
        ////metodo de mostrar cardapio
        //cardapio.mostrarCardapio();
        
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
        Pedido1.mostrarPedido();
        System.out.println("-----------------------------------------------------------------------------------------------");
        //metodo para finalizar pedido
        Pedido1.finalizarPedido();

        

    }   
    
}
