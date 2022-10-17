package pedidos;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.Serializable;

public class Venda implements Serializable{

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
        this.finalizarPedidoTeste();
        this.regraDeNegocio01();
        this.regraDeNegocio03();
        //this.finalizarPedido();
    }

    public Venda(){
        
    }
    
    public void regraDeNegocio03(){
        //Se o pagamento for em debito ou em credito, sera acrescentado uma taxa de 1 real.
        if (this.formaDePagamento == formaDePagamento.credito || this.formaDePagamento == formaDePagamento.debito){
            this.valorTotal+=1;
        }
    }
    public ArrayList<Item> getProdutos() {
        return itens;
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
    
    public String mostrarPedidoTeste(){
        String a = "";
        for (Item i: this.vendas){
            a += (i.mostrar()+ "    ||    " + "\n" );
        }
        return a;
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
    
    public void regraDeNegocio01(){
        if (this.valorTotal >= 150){
            this.valorTotal = this.valorTotal*0.90;
        }
        //return valorTotal;
    }
    
    public void finalizarPedido(){
        System.out.println("Cliente: "+this.cliente);
        System.out.println("   ------------------------------------   ");
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

        public String finalizarPedidoTeste(){
        return ("Cliente: "+this.cliente)+ "\n"+
        ("   ------------------------------------   ")+"\n"+
        // Regra de negocio 01
        //("Qntd    Produtos        Preco")+"\n"+
        //("------------------------------------")+"\n"+
        this.mostrarPedidoTeste()+"\n"+
        "\n"+
        //System.out.println(this.valorTotal);
        ("Forma de pagamento: " +  this.formaDePagamento)+"   --  \n"+
        ("Total:     R$" + numberFormat.format(this.valorTotal));
    }
        
        public String emitirNotaFiscal(){
        return ("Cliente: "+this.cliente)+ "\n"+
        ("   ------------------------------------   ")+"\n"+
        // Regra de negocio 01
        //("Qntd    Produtos        Preco")+"\n"+
        //("------------------------------------")+"\n"+
        this.mostrarPedidoTeste()+"\n"+
        "\n"+
        //System.out.println(this.valorTotal);
        ("Forma de pagamento: " +  this.formaDePagamento)+"   --  \n"+
        ("Total:     R$" + numberFormat.format(this.valorTotal))+"   --  \n"+
        ("Valor Pago:     R$" + numberFormat.format(this.valorPago(this.valorPago)))+"   --  \n"+
        ("Troco:     R$" + numberFormat.format(troco()));
    }
    
    @Override
    public String toString() {
        return ("Cliente: "+ 
        cliente +"\n------------------------------------"+
        "\nQntd    Produtos        Preco"+
        "\n------------------------------------"+
        "    ||   "+
        "\nForma de Pagamento: "+ formaDePagamento+
        "\nTotal:                    R$" + numberFormat.format(this.valorTotal)+
        "\nValor Pago:               R$" + numberFormat.format(this.valorPago(this.valorPago))+
        "\nTroco:                    R$" + numberFormat.format(troco()) + "                ");
    }
    
}   

