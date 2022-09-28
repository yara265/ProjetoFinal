package cardap;

public class Vitamina extends Produto{
    
    public String nome = "Vitamina";
    public String sabor;
    public boolean acucar;
    public double volume;
    
    public Vitamina(double preco, String sabor, boolean acucar, double volume) {
        super(preco, "Vitamina");
        this.sabor = sabor;
        this.acucar = acucar;
        this.volume = volume;
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

    @Override
    public String mostrarProduto(){
        return ("Produto: " + nome + " de "+ "\nPreço R$" + preco);
    }
}
