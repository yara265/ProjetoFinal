package pedidos;
import java.util.ArrayList;
import cardapio.Produto;
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
        this.regraDeNegocio03();
                
    }

    public void regraDeNegocio03(){
        //Se o pagamento for em debito ou em credito, sera acrescentado uma taxa de 1 real.
        if (this.formaDePagamento == formaDePagamento.credito || this.formaDePagamento == formaDePagamento.debito){
            this.valor+=1;
        }
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
        for (Item i: this.itens){
            this.valor += i.getPreco();
        }
        return valor;
    }
    
    public double valorPago(){
        if (this.formaDePagamento == FormaDePagamento.credito 
            || this.formaDePagamento == FormaDePagamento.debito 
            || this.formaDePagamento == FormaDePagamento.pix){
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
            System.out.println(i.getQuantidade()+ "    " + i.mostrar() + "      R$" + i.getPreco());
        }
    }
    
    public void finalizarPedido(){
        Venda v = new Venda(this.cliente, this.itens, this.formaDePagamento, this.calcularPedido(), this.valorPago());    
    }
    
    public void teste(){
         for (Item i: this.itens){
            System.out.println(i.getPreco());
        }
    }   
    
    
}
