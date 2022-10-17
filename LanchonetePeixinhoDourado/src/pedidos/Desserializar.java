package pedidos;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Desserializar {
    
    Venda venda;
    ArrayList<Venda> vendxs = new ArrayList<Venda>();
    String v;
    
    public Desserializar(){
    }
    
    public String desserializar(){
        System.out.println("\n" + "\n"+ "\n"+ "\n"+ "\n"+ "\n");
        try{
            System.out.println("desserializando");
            FileInputStream fin = new FileInputStream("vendas.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            
            vendxs = (ArrayList<Venda>) ois.readObject();
            
            ois.close();
            fin.close();
            //System.out.println(v1);
            for (Venda i: this.vendxs){
                v += (i.finalizarPedidoTeste() + "\n");
            }
            return v;
        }
        catch (Exception e){
            e.printStackTrace();
            return"";
        }
    }
}
