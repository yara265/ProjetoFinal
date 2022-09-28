package pedidos;
import java.util.ArrayList;
import cardap.Produto;

public class Pedido {

    public ArrayList<Item> itens = new ArrayList<Item>();
    public String cliente;
    public double valor;
    public String formaDePagamento;
    
    public Pedido(String cliente, String formaDePagamento){
        this.cliente = cliente;
        this.formaDePagamento = formaDePagamento;
    }

    public ArrayList<Item> getProdutos() {
        return itens;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setProdutos(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    
    public String valorTotal(){
        return "O valor total do pedido eh de: " + this.valor;
    }
    
    public void addItem(Item item){
        this.itens.add(item);
        this.calcularPedido(item);
    }
    
    public void removeItem (Item item){
        this.itens.remove(item);
    }

    public double calcularPedido(Item produto){
        this.valor = this.valor + produto.getPreco();
        return valor;
    }
    
    public void mostrarPedido(){
        for (Item i: this.itens){
            System.out.println(i.mostrar());
        }
    }
    
    

    
}