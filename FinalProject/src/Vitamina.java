package ProjetoFinal;

public class Vitamina extends Produto{
    
    public double preco;
    public String validade;
    public String sabor;
    public boolean acucar;
    public double volume;
    
    public Vitamina (double preco, String validade, String sabor, boolean acucar, double volume){
        super(preco, validade);
        this.sabor = sabor;
        this.acucar = acucar;
        this.volume = volume;
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

    public boolean isAcucar() {
        return acucar;
    }

    public double getVolume() {
        return volume;
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

    public void setAcucar(boolean acucar) {
        this.acucar = acucar;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    
}
