package pedidos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializar {
    
    ArrayList vendas;
    Venda venda;
    
    public Serializar(ArrayList vendas){
        this.vendas = vendas;
    }
    
    public void serializar(Venda venda){
        this.vendas.add(venda);
    try{
        FileOutputStream fout = new FileOutputStream("vendas.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        
        oos.writeObject(vendas);
        
        oos.close();
        fout.close();
        }
    catch (IOException e){
            e.printStackTrace();
        }
    }
}
