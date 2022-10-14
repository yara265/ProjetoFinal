package cardapio;

public class Sanduiche extends Produto{

    public String recheio;
    public String tipoDoPao;
    public String molho;
    
    public Sanduiche(String recheio, String tipoDoPao, String molho) {
        super(10, "Sanduiche");
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
        System.out.println("----------Produto-----------");
        return (nome + " de " + recheio +"\nTipo de Pão: " + tipoDoPao +"\nMolho: " + molho + "\nValor:R$" + preco);
    }
    
}
