package pedidos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;

public class Serializacao {
    public static final String ARQUIVO_VENDAS = "BdD/";
    public static final String NOME_ARQUIVO = ARQUIVO_VENDAS + "vendas.txt";

    public static ArrayList<Venda> readFile() throws IOException, ClassNotFoundException {
        try (FileInputStream file = new FileInputStream(NOME_ARQUIVO);
             ObjectInputStream objectInput = new ObjectInputStream(file)) {
            return (ArrayList<Venda>) objectInput.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        }
    }

    public static void writeFile(Venda venda) throws IOException, ClassNotFoundException {
        ArrayList<Venda> vendas = readFile();
        try (FileOutputStream file = new FileOutputStream(NOME_ARQUIVO);
             ObjectOutputStream object = new ObjectOutputStream(file)) {
            vendas.add(venda);
            object.writeObject(vendas);
        } catch (IOException Error) {
            System.err.println("Erro ao escrever no arquivo: " + Error.getMessage());
            throw Error;
        }
    }
}
