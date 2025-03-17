import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class Field extends JPanel {

    private Biblioteca library = new Biblioteca();
    private final Color mc = new Color(42, 46, 57);
    private DefaultTableModel tableModel; // Dichiarato a livello di classe per accesso da più metodi

    public Field() {
        setLayout(new BorderLayout()); // Imposta il layout corretto

        String[] columns = {"Titolo", "Autore", "Data Pubbl.", "Editore"};

        // Creazione del modello della tabella
        tableModel = new DefaultTableModel(columns, 0); // 0 righe iniziali

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        Btn refresh = new Btn("↺", mc, 18);

        refresh.addActionListener(e -> loadLibraryData()); // Ricarica i dati

        scrollPane.setBackground(mc);
        scrollPane.setForeground(Color.WHITE);
        setBackground(mc);

        add(scrollPane, BorderLayout.CENTER);
        add(refresh, BorderLayout.SOUTH);

        loadLibraryData(); // Caricamento iniziale
    }

    private void loadLibraryData() {
        tableModel.setRowCount(0); // Svuota la tabella prima di caricare i dati

        List<Libro> libri = library.getLibrary();

        if (libri != null) { // Evita NullPointerException
            for (Libro libro : libri) {
                Object[] rowData = {
                        libro.getTitolo(),
                        libro.getAutore(),
                        libro.getDataPub(),
                        libro.getEditore()
                };
                tableModel.addRow(rowData);
            }
        }
    }

    public void sLibrary() throws java.io.IOException {
        library.saveLibrary();
    }
}
