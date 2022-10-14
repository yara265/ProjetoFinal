package cardapio;

public class Refrigerante extends Produto{
    
    public String marca;
    public String volume;
    
    public Refrigerante(String marca, String volume) {
        super(7.50, "Refrigerante");
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
    public String mostrarProduto(){
        System.out.println("----------Produto-----------");
        return (nome + "\nMarca: " + marca +" \nVolume: "+ volume +"ml " + "\nValor:R$" + preco);
    }
}
