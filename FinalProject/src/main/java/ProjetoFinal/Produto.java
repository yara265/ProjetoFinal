package ProjetoFinal;

public class Produto {
    
    public double preco;
    public String validade;
    
    public Produto (double preco, String validade){
        this.preco = preco;
        this.validade = validade;
    } 

    public double getPreco() {
        return preco;
    }

    public String getValidade() {
        return validade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    
}
