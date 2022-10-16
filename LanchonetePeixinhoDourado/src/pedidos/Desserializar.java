package pedidos;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Desserializar {
    
    Venda venda;
    
    public Desserializar(){
    }
    
    public String desserializar(){
        try{
            System.out.println("desserializando");
            FileInputStream fin = new FileInputStream("vendas.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            
            venda = (Venda) ois.readObject();
            
            ois.close();
            fin.close();
            //System.out.println(v1);
            System.out.println(venda.finalizarPedidoTeste());
            return venda.finalizarPedidoTeste();
        }
        catch (Exception e){
            e.printStackTrace();
            return"";
        }
    }
}
