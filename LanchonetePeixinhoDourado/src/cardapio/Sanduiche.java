package cardapio;

public class Sanduiche extends Produto{

    public Disponivel recheio;
    public Disponivel tipoDoPao;
    public Disponivel molho;
    
    public Sanduiche(double preco, Disponivel recheio, Disponivel tipoDoPao, Disponivel molho) {
        super(preco, "Sanduiche");
        this.recheio = recheio;
        this.tipoDoPao = tipoDoPao;
        this.molho = molho;
    }

    public void setRecheio(Disponivel recheio) {
        this.recheio = recheio;
    }

    public void setTipoDoPao(Disponivel tipoDoPao) {
        this.tipoDoPao = tipoDoPao;
    }

    public void setMolho(Disponivel molho) {
        this.molho = molho;
    }
    
    @Override
    public String mostrarProduto(){
        System.out.println("----------Produto-----------");
        return (nome + " de " + recheio +"\nTipo de Pão: " + tipoDoPao +"\nMolho: " + molho + "\nValor:R$" + preco);
    }
    
}
