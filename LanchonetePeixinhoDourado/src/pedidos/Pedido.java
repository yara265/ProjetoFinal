package pedidos;
import java.util.ArrayList;
//import cardapio.Produto;
import java.util.Scanner;

public class Pedido {

    public ArrayList<Item> itens = new ArrayList<Item>();
    public String cliente;
    public double valor;
    public FormaDePagamento formaDePagamento;
    public double valorPago;
    Scanner pago = new Scanner(System.in);
    
    public Pedido(String cliente, FormaDePagamento formaDePagamento){
        this.cliente = cliente;
        this.formaDePagamento = formaDePagamento;
                
    }
    
    public Pedido(){
        this.cliente = null;
        this.formaDePagamento = null;
    }


    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public FormaDePagamento getFormaDePagamento() {
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

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    
    public double valorTotal(){
        return this.valor;
    }
    
    public void addItem(Item item){
        this.itens.add(item);
    }
    
    public void removeItem (Item item){
        this.itens.remove(item);
        this.valor = this.valor - item.getPreco();
    }

    public double calcularPedido(){
        this.valor = 0;
        for (Item i: this.itens){
            this.valor += i.getPreco();
        }
        return valor;
    }
    
    public double valorPago(){
        if (this.formaDePagamento == FormaDePagamento.CREDITO
            || this.formaDePagamento == FormaDePagamento.DEBITO
            || this.formaDePagamento == FormaDePagamento.PIX){
                return this.valorTotal();
        }
        
        else{
            System.out.println("O valor pago foi de: ");
            double valorPago = pago.nextDouble();
            return valorPago;
        }
    }
    
    public void mostrarPedido(){
        for (Item i: this.itens){
            System.out.println(i.getQuantidade()+ "    " + i.mostrar());
        }
    }
    
    public Venda finalizarPedido(){
        Venda v = new Venda(this.cliente, this.itens, this.formaDePagamento, this.calcularPedido(), this.valorPago);    
        return v;
    }
    
    public void teste(){
         for (Item i: this.itens){
            System.out.println(i.getPreco());
        }
    }   
    
    
}
