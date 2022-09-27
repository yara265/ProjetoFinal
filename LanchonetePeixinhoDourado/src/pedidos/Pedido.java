package pedidos;
import java.util.ArrayList;
import cardapio.Produto;

public class Pedido {

    public ArrayList<Produto> produtos;
    public String cliente;
    public double valor;
    public FormaDePagamento formaDePagamento;
    
    public Pedido(ArrayList<Produto> produtos, String cliente, double valor, FormaDePagamento formaDePagamento){
        this.produtos = produtos;
        this.cliente = cliente;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
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

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
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

    public double calcularPedido(ArrayList<Produto> produtos){
        double preco = 0;
        for (Produto i: produtos){
            preco = preco + i.getPreco();
        }
        return preco;
    }
    
    public void mostrarPedido(ArrayList<Produto> produtos){
        for (Produto i: produtos){
            System.out.println(i);
        }
    }
}
