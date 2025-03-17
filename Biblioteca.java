import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> library = new ArrayList<>();

    public int size() {
        return library.size();
    }

    public ArrayList<Libro> getLibrary() {
        return library;
    }

    public void aggiungiLibro(Libro lib) {
        library.add(lib);
    }

    public void eliminaLibro(String titolo) {
        for (Libro lib : library) {
            if(lib.getTitolo().equals(titolo)) {
                library.remove(lib);
            }
        }
    }

    public void cercaParolaChiave(String p) {
        ArrayList<Libro> trovati = new ArrayList<>();
        for (Libro lib : library) {
            if(lib.getTitolo().contains(p)) {
                trovati.add(lib);
            }
        }
    }

    public void saveLibrary() throws java.io.IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"));
        oos.writeObject(library);
        oos.close();
    }

    public void loadLibrary() throws java.io.IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"));

        try {
            this.library = (ArrayList<Libro>)ois.readObject();
        }
        catch (ClassNotFoundException exc) {}
        ois.close();
    }
}