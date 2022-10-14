package cardapio;

public class Vitamina extends Produto{
    
    public String fruta;
    public boolean acucar;
    public String volume;
    
    public Vitamina(String fruta, boolean acucar, String volume) {
        super(7, "Vitamina");
        this.fruta = fruta;
        this.acucar = false;
        this.volume = volume;
        if(volume=="500"){
            this.preco = 9;
        }else if(volume=="800"){
            this.preco = 11;
        }
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
        System.out.println("Vitamina---------------R$"+this.preco);
        String produtos = "";

        return produtos;
    }
}
