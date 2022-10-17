package cardapio;

import cardapio.Produto;
import java.util.ArrayList;

import java.util.ArrayList;

public class Cardapio_ {

    public ArrayList<Produto> produtos = new ArrayList<Produto>();
            
    public Cardapio_(){
        Pizza p1 = new Pizza("Calabresa", true);
        Pizza p2 = new Pizza("Mussarela", true);
        Pizza p3 = new Pizza("Portuguesa", true);
        
        Refrigerante r1 = new Refrigerante("Coca Cola", "280 ml");
        Refrigerante r2 = new Refrigerante("Coca Cola", "1000 ml");
        Refrigerante r3 = new Refrigerante("Pepsi", "280 ml");
        Refrigerante r4 = new Refrigerante("Pepsi", "1000 ml");
        Refrigerante r5 = new Refrigerante("Fanta uva", "280 ml");
        Refrigerante r6 = new Refrigerante("Fanta uva", "1000 ml");

        Salgado s1 = new Salgado("Coxinha de Frango", "frito");
        Salgado s2 = new Salgado("Coxinha de Frango", "assado");
        Salgado s3 = new Salgado("jacare", "frito");
        Salgado s4 = new Salgado("jacare", "assado");
        Salgado s5 = new Salgado("Enrolado de Salsicha", "frito");
        Salgado s6 = new Salgado("Enrolado de Salsicha", "assado");
        
        Sanduiche san1 = new Sanduiche("Barbecue","Integral","Queijo");
        Sanduiche san2 = new Sanduiche("Ketchup","Frances","Presunto");
        Sanduiche san3 = new Sanduiche("Chedar","Hamburguer","Pate de atum");

        Vitamina v1 = new Vitamina("Banana", true, "200 ml");
        Vitamina v2 = new Vitamina("Maca", true, "200 ml");
        Vitamina v3 = new Vitamina("Abacate", true, "200 ml");
        Vitamina v4 = new Vitamina("Pera", true, "200 ml");
        Vitamina v5 = new Vitamina("Banana", true, "500 ml");
        Vitamina v6 = new Vitamina("Maca", true, "500 ml");
        Vitamina v7 = new Vitamina("Abacate", true, "500 ml");
        Vitamina v8 = new Vitamina("Pera", true, "500 ml");
        Vitamina v9 = new Vitamina("Banana", true, "800 ml");
        Vitamina v10 = new Vitamina("Maca", true, "800 ml");
        Vitamina v11 = new Vitamina("Abacate", true, "800 ml");
        Vitamina v12 = new Vitamina("Pera", true, "800 ml");
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        
        produtos.add(r1);
        produtos.add(r2);
        produtos.add(r3);
        produtos.add(r4);
        produtos.add(r5);
        produtos.add(r6);

        produtos.add(s1);
        produtos.add(s2);
        produtos.add(s3);
        produtos.add(s4);
        produtos.add(s5);
        produtos.add(s6);

        produtos.add(san1);
        produtos.add(san2);
        produtos.add(san3);
       
        produtos.add(v1);
        produtos.add(v2);
        produtos.add(v1);
        produtos.add(v3);
        produtos.add(v4);
        produtos.add(v5);
        produtos.add(v6);
        produtos.add(v7);
        produtos.add(v8);
        produtos.add(v9);
        produtos.add(v10);
        produtos.add(v11);
        produtos.add(v12);
    }
    
    public String mostrar(){
        String a = "";
        for (Produto i: this.produtos){
            a += (i.mostrarProduto()+ "    ||    " + "\n" );
        }
        return a;
    }

}
