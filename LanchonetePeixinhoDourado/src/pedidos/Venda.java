package pedidos;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Venda {

    public ArrayList<Item> itens = new ArrayList<Item>();
    public ArrayList<Item> vendas = new ArrayList<Item>();
    public String cliente;
    public double valorTotal;
    public FormaDePagamento formaDePagamento;
    public double valorPago;
    public double troco;
    DecimalFormat numberFormat = new DecimalFormat("#.00");

    
    public Venda(String cliente, ArrayList<Item> itens,FormaDePagamento formaDePagamento, double valorTotal, double valorPago){
        this.cliente = cliente;
        this.itens = itens;
        this.formaDePagamento = formaDePagamento;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.addVendas();
        this.finalizarPedido();
    }

    public void addVendas(){
        for (Item i: this.itens){
            if (vendas.contains(i)){
                i.addQuantidade();
        }
            else{
                vendas.add(i);
                   }
        }
    }
    
    public void mostrarPedido(){
        for (Item i: this.vendas){
            System.out.println(i.getQuantidade()+ "    " + i.mostrar() + "      R$" + numberFormat.format(i.getPreco()));
        }
    }
    
    public double valorPago(double valorPago){
          if (this.formaDePagamento == FormaDePagamento.credito 
            || this.formaDePagamento == FormaDePagamento.debito 
            || this.formaDePagamento == FormaDePagamento.pix){
                return this.valorTotal;
        }
          else{
              return this.valorPago;
          }
    }
    public double troco(){
            return valorPago(this.valorPago) - this.valorTotal;
    }
    
    public double regraDeNegocio01(){
        if (this.valorTotal >= 150){
            this.valorTotal = this.valorTotal*0.90;
        }
        return valorTotal;
    }
    
    public void finalizarPedido(){
        System.out.println("Cliente: "+this.cliente);
        System.out.println("------------------------------------");
        // Regra de negocio 01
        System.out.println("Qntd    Produtos        Preco");
        System.out.println("------------------------------------");
        this.mostrarPedido();
        this.regraDeNegocio01();
        //System.out.println(this.valorTotal);
        System.out.println("Forma de pagamento: " +  this.formaDePagamento);
        System.out.println("Total:                    R$" + numberFormat.format(this.valorTotal));
        System.out.println("Valor Pago:               R$" + numberFormat.format(this.valorPago(this.valorPago)));
        System.out.println("Troco:                    R$" + numberFormat.format(troco()));
    }
}   

