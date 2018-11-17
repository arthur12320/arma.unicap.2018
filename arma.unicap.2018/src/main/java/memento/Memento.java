package memento;

import arquivos.GerenciadorArquivos;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author tulioaoki
 */
public class Memento {

    private static int state;
    private static final GerenciadorArquivos ga = new GerenciadorArquivos();
    private static final String arquivoMemento = "varejoAmericanas.txt";

    public Memento(int state) {
        Memento.state = state;
    }

    public static void load() {
        try {
            File file = new File(arquivoMemento);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                ga.openToRead(arquivoMemento);
                Memento.state = (int) ga.lerObjeto();
                ga.closeAfterRead();
            }
        } catch (IOException err) {
            System.err.println("Falha ao tentar pegar os arquvios");
            System.exit(1);
        }

    }

    public static void save() {
        ga.openToWrite(arquivoMemento);
        ga.gravaObjeto(state);
        ga.closeAfterWrite();
    }

    /**
     *
     * @return
     */
    public static int getState() {
        return state;
    }

    public void setState(int state) {
        Memento.state = state;
    }
}
