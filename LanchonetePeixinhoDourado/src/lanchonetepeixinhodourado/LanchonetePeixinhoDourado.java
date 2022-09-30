package lanchonetepeixinhodourado;
import cardapio.Pizza;
import cardapio.Refrigerante;
import pedidos.*;

public class LanchonetePeixinhoDourado {

    public static void main(String[] args) {
        
        Pizza p1 = new Pizza(40, "mussarela", true);
        Refrigerante r1 = new Refrigerante(7, "coca", 500.00);
        Item i1 = new Item(p1);
        Item i2 =new Item(r1);
        i1.addQuantidade();
        i1.addQuantidade();
        Pedido ped = new Pedido("Kirk", FormaDePagamento.credito);
        ped.addItem(i1);
        ped.addItem(i2);
        ped.removeItem(i2);
        ped.addItem(i1);
        ped.addItem(i1);
        ped.addItem(i1);
        ped.finalizarPedido();
    }   
    
}
