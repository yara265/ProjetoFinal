package com.mycompany.finalproject;


public class Pizza extends Produto{
    
    public double preco;
    public String validade;
    public boolean borda;
    public String molho;

    public Pizza (double preco, String validade, boolean borda, String molho){
        super(preco, validade);
        this.borda = borda;
        this.molho = molho;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getValidade() {
        return validade;
    }

    public boolean isBorda() {
        return borda;
    }

    public String getMolho() {
        return molho;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
    
    
}
