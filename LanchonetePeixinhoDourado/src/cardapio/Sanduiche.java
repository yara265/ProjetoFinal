package cardapio;

public class Sanduiche extends Produto{

    public String nome = "Sanduiche";
    public String recheio;
    public String tipoDoPao;
    public String molho;
    
    public Sanduiche(double preco, String recheio, String tipoDoPao, String molho) {
        super(preco, "Sanduiche");
        this.recheio = recheio;
        this.tipoDoPao = tipoDoPao;
        this.molho = molho;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setTipoDoPao(String tipoDoPao) {
        this.tipoDoPao = tipoDoPao;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
    
    @Override
    public String mostrarProduto(){
        return ("Produto: " + nome + " de " + recheio + " Tipo de pão " + tipoDoPao + "\nMolho " + molho);
    }
    
}
