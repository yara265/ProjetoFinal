package pedidos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializar {
    
    Venda venda;
    
    public Serializar(){
        
    }
    
    public void serializar(Venda venda){
    try{
        System.out.println("serializando");
        FileOutputStream fout = new FileOutputStream("vendas.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        
        oos.writeObject(venda);
        
        oos.close();
        fout.close();
        }
    catch (IOException e){
            e.printStackTrace();
        }
    }
}
