package cardapio;

public class Sanduiche extends Produto{

    public String recheio;
    public String tipoDoPao;
    public String molho;
        public double preco;

        
    public Sanduiche(String recheio, String tipoDoPao, String molho) {
        super(6.50, "Sanduiche");
        this.preco = 6.50;
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
        return nome + " de " + recheio +";  \nTipo de Pão: " + tipoDoPao +";  \nMolho: " + molho + ";  \nValor: R$" + this.preco;
    }
    
}
