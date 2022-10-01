package lanchonetepeixinhodourado;
import cardapio.*;
import pedidos.*;

public class LanchonetePeixinhoDourado {

    public static void main(String[] args) {
        
        Pizza p1 = new Pizza(40, "mussarela", true);
        Refrigerante r1 = new Refrigerante(7, "coca", 500.00);
        Salgado s1 = new Salgado(10, "salsicha", "frito");
        Sanduiche san = new Sanduiche(8.99, "presunto e queijo", "massa fina", "maionese");
        Vitamina vit = new Vitamina(12, "morango", true, 500);
        Item i1 = new Item(p1);
        Item i2 =new Item(r1);
        Item i3 = new Item(s1);
        Item i4 = new Item(san);
        Item i5 = new Item(vit);
        Pedido ped = new Pedido("Kirk", FormaDePagamento.credito);
        ped.addItem(i1);
        ped.addItem(i2);
        ped.addItem(i3);
        ped.addItem(i4);
        ped.addItem(i5);
        ped.addItem(i5);
        ped.finalizarPedido();
    }   
    
}
