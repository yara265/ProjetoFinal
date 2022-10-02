package cardapio;

public class Vitamina extends Produto{
    
    public Disponivel fruta;
    public boolean acucar;
    public double volume;
    
    public Vitamina(double preco, Disponivel fruta, boolean acucar, double volume) {
        super(preco, "Vitamina");
        this.fruta = fruta;
        this.acucar = false;
        this.volume = volume;
    }

    public void setSabor(Disponivel fruta) {
        this.fruta = fruta;
    }

    public void setAcucar(boolean acucar) {
        this.acucar = true;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String mostrarProduto(){
        System.out.println("----------Produto-----------");
        return (nome + " de "+ fruta + "\nVolume: " + volume +"ml " + "\nValor:R$" + preco);
    }
}
