package cardapio;

public class Refrigerante extends Produto{
    
    public String marca;
    public String volume;
    public double preco;

    public Refrigerante(String marca, String volume) {
        super(7, "Refrigerante");
        if (volume == "1000 ml"){
            this.preco = 7.50;
        }
        else{
            this.preco = 5.50;
        }
        this.marca = marca;
        this.volume = volume;
    }

    public void setSabor(String sabor) {
        this.marca = sabor;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public double getPreco(){
        if (volume == "1000 ml"){
            return 7.50;
        }
        else{
            return 5.50;
        }
    }
    
    @Override
    public String mostrarProduto(){
        return this.marca +" \nVolume: "+ volume + ";  \nValor: R$" + this.preco;
    }
}
