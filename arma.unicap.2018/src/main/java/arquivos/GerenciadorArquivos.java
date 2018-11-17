/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GerenciadorArquivos {

    private ObjectInputStream input;
    private ObjectOutputStream output;

    public void openToWrite(String nomeArq) {
        try {
            FileOutputStream arq = new FileOutputStream(nomeArq);
            output = new ObjectOutputStream(arq);

        } catch (IOException IoException) {
            System.err.println("Erro ao ler o arquivo");
            System.exit(1);
        }
    }

    public void openToRead(String nomeArq) {
        try {
            FileInputStream arq = new FileInputStream(nomeArq);
            input = new ObjectInputStream(arq);
        } catch (IOException IoException) {
            System.err.println("Erro ao ler o arquivo");
            System.exit(1);
        }
    }

    public void closeAfterRead() {
        try {
            if (input != null) {
                input.close();
                input = null;
            }
        } catch (IOException ioException) {
            System.err.println("Erro ao fechar o arquivo");
            System.exit(1);
        }

    }

    public void closeAfterWrite() {
        try {
            if (output != null) {
                output.close();
                output = null;
            }
        } catch (IOException ioException) {
            System.err.println("Erro ao fechar o arquivo");
            System.exit(1);
        }
    }

    public void gravaObjeto(Object al) {
        try {
            if (output != null) {
                output.writeObject(al);
                output.flush();
            }
        } catch (IOException ioException) {
            System.err.println("Erro ao gravar o arquivo");
            System.exit(1);
        }
    }

    public Object lerObjeto() {
        try {
            if (input != null) {
                return input.readObject();
            }
        } catch (EOFException eofException) {
        } catch (IOException ioException) {
            System.err.println("Erro ao fechar o arquivo");
            return null;
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Erro: classe não encontrada.");
            return null;
        }
        return null;
    }

}