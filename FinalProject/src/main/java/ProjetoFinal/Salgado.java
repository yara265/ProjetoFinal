package ProjetoFinal;

public class Salgado extends Produto{
    
    public double preco;
    public String validade;
    public String sabor;
    public String tipo;
    
    public Salgado (double preco, String validade, String sabor, String tipo){
        super(preco, validade);
        this.sabor = sabor;
        this.tipo = tipo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getValidade() {
        return validade;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
