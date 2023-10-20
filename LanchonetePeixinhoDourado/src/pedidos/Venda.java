package pedidos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.Serializable;

public class Venda implements Serializable {

    public ArrayList<Item> itens = new ArrayList<Item>();
    public ArrayList<Item> vendas = new ArrayList<Item>();
    public String cliente;
    public double valorTotal;
    public FormaDePagamento formaDePagamento;
    public double valorPago;
    DecimalFormat numberFormat = new DecimalFormat("#.00");

    public Venda(String cliente, ArrayList<Item> itens, FormaDePagamento formaDePagamento, double valorTotal, double valorPago) {
        this.cliente = cliente;
        this.itens = itens;
        this.formaDePagamento = formaDePagamento;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.addVendas();
        this.finalizarPedidoTeste();
        this.regraDeNegocio01();
        this.regraDeNegocio03();
    }

    public Venda() {

    }

    public void regraDeNegocio03() {
        // Se o pagamento for em débito ou em crédito, será acrescentado uma taxa de 1 real.
        if (this.formaDePagamento == FormaDePagamento.CREDITO || this.formaDePagamento == FormaDePagamento.DEBITO) {
            this.valorTotal += 1;
        }
    }

    public ArrayList<Item> getProdutos() {
        return itens;
    }

    public void addVendas() {
        for (Item i : this.itens) {
            if (vendas.contains(i)) {
                i.addQuantidade();
            } else {
                vendas.add(i);
            }
        }
    }

    public Object mostrarPedido() {
        StringBuilder sb = new StringBuilder();
        sb.append("Qntd    Produtos        Preco\n");
        sb.append("------------------------------------\n");
        for (Item i : this.vendas) {
            sb.append(i.getQuantidade() + "    " + i.mostrar() + "      R$").append(numberFormat.format(i.getPreco())).append("\n");
        }
        System.out.print(sb.toString());
        return null;
    }

    public String mostrarPedidoTeste() {
        StringBuilder sb = new StringBuilder();
        for (Item i : this.vendas) {
            sb.append(i.mostrar()).append("    ||    \n");
        }
        return sb.toString();
    }

    public double valorPago(double valorPago) {
        if (this.formaDePagamento == FormaDePagamento.CREDITO || this.formaDePagamento == FormaDePagamento.DEBITO || this.formaDePagamento == FormaDePagamento.PIX) {
            return this.valorTotal;
        } else {
            return this.valorPago;
        }
    }

    public double troco() {
        return valorPago(this.valorPago) - this.valorTotal;
    }

    public void regraDeNegocio01() {
        if (this.valorTotal >= 150) {
            this.valorTotal = this.valorTotal * 0.90;
        }
    }

    public void finalizarPedido() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(this.cliente).append("\n");
        sb.append("   ------------------------------------   \n");
        sb.append("Qntd    Produtos        Preco\n");
        sb.append("------------------------------------\n");
        sb.append(mostrarPedido());
        regraDeNegocio01();
        sb.append("Forma de pagamento: ").append(this.formaDePagamento).append("\n");
        sb.append("Total:                    R$").append(numberFormat.format(this.valorTotal)).append("\n");
        sb.append("Valor Pago:               R$").append(numberFormat.format(valorPago(this.valorPago))).append("\n");
        sb.append("Troco:                    R$").append(numberFormat.format(troco()));
        System.out.print(sb.toString());
    }

    public String finalizarPedidoTeste() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(this.cliente).append("\n");
        sb.append("   ------------------------------------   \n");
        sb.append(mostrarPedidoTeste()).append("\n");
        sb.append("Forma de pagamento: ").append(this.formaDePagamento).append("   --  \n");
        sb.append("Total:     R$").append(numberFormat.format(this.valorTotal));
        return sb.toString();
    }

    public String emitirNotaFiscal() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(this.cliente).append("\n");
        sb.append("   ------------------------------------   \n");
        sb.append(mostrarPedidoTeste()).append("\n");
        sb.append("Forma de pagamento: ").append(this.formaDePagamento).append("   --  \n");
        sb.append("Total:     R$").append(numberFormat.format(this.valorTotal)).append("   --  \n");
        sb.append("Valor Pago:     R$").append(numberFormat.format(valorPago(this.valorPago))).append("   --  \n");
        sb.append("Troco:     R$").append(numberFormat.format(troco()));
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(cliente).append("\n------------------------------------\n");
        sb.append("Qntd    Produtos        Preco\n");
        sb.append("------------------------------------\n");
        sb.append("    ||   \n");
        sb.append("Forma de Pagamento: ").append(formaDePagamento).append("\n");
        sb.append("Total:                    R$").append(numberFormat.format(this.valorTotal)).append("\n");
        sb.append("Valor Pago:               R$").append(numberFormat.format(valorPago(this.valorPago))).append("\n");
        sb.append("Troco:                    R$").append(numberFormat.format(troco())).append("                ");
        return sb.toString();
    }
}
