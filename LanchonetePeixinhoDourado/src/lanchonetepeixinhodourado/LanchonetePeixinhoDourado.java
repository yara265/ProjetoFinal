package lanchonetepeixinhodourado;
import cardap.*;
import pedidos.*;

public class LanchonetePeixinhoDourado {

    public static void main(String[] args) {
        
        Pizza p1 = new Pizza(40, "mussarela", true);
        Refrigerante r1 = new Refrigerante(7, "coca", 500.00);
        Item i1 = new Item(p1);
        Item i2 =new Item(r1);
        i1.addQuantidade();
        i1.addQuantidade();
        Pedido ped = new Pedido("Kirk", "cartão");
        ped.addItem(i1);
        ped.addItem(i2);
        System.out.println(ped.valorTotal());
        ped.mostrarPedido();
        ped.removeItem(i2);
    }   
    
}
