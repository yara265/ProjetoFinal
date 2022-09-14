package com.mycompany.finalproject;

public class Pagamento {
    
    public double valor;
    public double troco;
    
    public Pagamento (){
    }

    public double pagamentoDinheiro(double dinheiro){
        this.troco = valor - dinheiro;
        return this.troco;
    }
    
    public void pagamentoCartao (){
        
    }
    
    public void pagamentoCheque(){
        
    }
    
    
}
