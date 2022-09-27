package cardapio;

public class Refrigerante extends Produto{
    
    public String nome = "Refrigerante";
    public String marca;
    public double volume;
    
    public Refrigerante( double preco, String marca, double volume) {
        super(preco);
        this.marca = marca;
        this.volume = volume;
    }

    public void setSabor(String sabor) {
        this.marca = sabor;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public void mostrarProduto(){
        System.out.println("Produto: " + nome + "\nMarca: " + marca +" "+ volume +"ml " + "\nPreço R$" + preco);
    }
}
