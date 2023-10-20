package pedidos;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Desserializar {
    private ArrayList<Venda> vendas = new ArrayList<>();

    public Desserializar() {
    }

    public String Desserializar() {
        StringBuilder resultado = new StringBuilder();

        try {
            System.out.println("Iniciando desserialização: ");

            FileInputStream fin = new FileInputStream("vendas.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);

            vendas = (ArrayList<Venda>) ois.readObject();

            ois.close();
            fin.close();

            for (Venda venda : vendas) {
                resultado.append(venda.finalizarPedidoTeste()).append("\n");
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return resultado.toString();
    }
}
