package cardapio;

import java.util.ArrayList;

public class Disponivel {
    String nome;
    String tipo;

    static ArrayList<String> fruta = new ArrayList<String>();
    static ArrayList<String> tipoDoPao = new ArrayList<String>();
    static ArrayList<String> molho = new ArrayList<String>();
    static ArrayList<String> recheio = new ArrayList<String>();

    public Disponivel(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        
        if(tipo == "Fruta" || tipo == "fruta" ){
            fruta.add(nome);
        }else if(tipo == "Pao" || tipo == "pao" ){
            tipoDoPao.add(nome);
        }else if(tipo == "Molho" || tipo == "molho"){
            molho.add(nome);
        }else if(tipo == "Recheio" || tipo == "recheio"){
            recheio.add(nome);
        }
    }   
        
    public static void mostrarFrutasDisponiveis(){
        int i = 1;
        System.out.println("----------Frutas Disponiveis----------");
        for (String frutas : fruta){
            System.out.printf("%d - %s\n", i, frutas);
            i++;
        }
    }
    public static void mostrarPaesDisponiveis(){
        int i = 1;
        System.out.println("-----------Paes Disponiveis-----------");
        for (String paes : molho){
            System.out.printf("%d - %s\n", i, paes);
            i++;
        }
    }
    public static void mostrarMolhoDisponiveis(){
        int i = 1;
        System.out.println("----------Molhos Disponiveis----------");
        for (String molhos : molho){
            System.out.printf("%d - %s\n", i, molhos);
            i++;
        }
    }
    public static void mostrarRecheioDisponiveis(){
        int i = 1;
        System.out.println("---------Recheios Disponiveis---------");
        for (String recheios : recheio){
            System.out.printf("%d - %s\n", i, recheios);
            i++;
        }
    }

    @Override
    public String toString() {
        return nome;
    }

    
}