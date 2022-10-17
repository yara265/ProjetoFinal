package cardapio;

public class Vitamina extends Produto{
    
    public String fruta;
    public boolean acucar;
    public String volume;
    public double preco;

    public Vitamina(String fruta, boolean acucar, String volume) {
        super(9, "Vitamina");
        if (volume == "200 ml"){
            this.preco = 4.50;
        }
        if (volume == "500 ml"){
            this.preco = 7.00;
        }
        if (volume == "800 ml"){
            this.preco = 8.50;
        }
        this.fruta = fruta;
        this.acucar = false;
        this.volume = volume;

    }

    public void setSabor(String fruta) {
        this.fruta = fruta;
    }

    public void setAcucar(boolean acucar) {
        this.acucar = true;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String mostrarProduto(){
        return "Vitamina de "+this.fruta+ ";  Volume: "+ this.volume +";  \nValor: R$" + this.preco;
    }
}
