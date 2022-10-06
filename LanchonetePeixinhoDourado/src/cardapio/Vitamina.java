package cardapio;

public class Vitamina extends Produto{
    
    public Disponivel fruta;
    public boolean acucar;
    public double volume;
    
    public Vitamina(Disponivel fruta, boolean acucar, double volume) {
        super(7, "Vitamina");
        this.fruta = fruta;
        this.acucar = false;
        this.volume = volume;
        if(volume==500){
            this.preco = 9;
        }else if(volume==800){
            this.preco = 11;
        }
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
        System.out.println("Vitamina---------------R$"+this.preco);
        String produtos = "";
        for(String frutaDisponivel: fruta.verificarFrutasDisponiveis()){
            produtos+=frutaDisponivel+"\n";
        }
        return produtos;
    }
}
