package pedidos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializacao {
    
    public static final String arquivo_vendas = "BdD/";
    public static final String nome_arquivo = arquivo_vendas + "vendas.txt";


    public static ArrayList<Venda> readFile(){
        ArrayList<Venda> vendas = new ArrayList<>();
        try{
            FileInputStream file = new FileInputStream(nome_arquivo);
            ObjectInputStream objectInput = new ObjectInputStream(file);

            Venda venda;
            Object object;
            object = objectInput.readObject();
            if(object!=null) vendas = (ArrayList<Venda>) object;
            file.close();
            objectInput.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return vendas;
    }


    public static void writeFile(Venda venda){
        ArrayList<Venda> vendas = readFile();
        try{
            FileOutputStream file = new FileOutputStream(nome_arquivo);
            ObjectOutputStream object = new ObjectOutputStream(file);

            vendas.add(venda);
            object.writeObject(vendas);
            file.close();
            object.close();

        }catch(Exception e){
            e.printStackTrace();
    }
}
}