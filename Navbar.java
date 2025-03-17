import javax.swing.*;
import java.awt.*;

public class Navbar extends JPanel {

    private final Color mc = new Color(46, 52, 64);

    public Navbar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(mc);

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        fileMenu.setForeground(Color.WHITE);
        editMenu.setForeground(Color.WHITE);

        JMenuItem nuovo = new JMenuItem("New");
        JMenuItem apri = new JMenuItem("Open");
        JMenuItem salva = new JMenuItem("Save");

        JMenuItem addBook = new JMenuItem("Aggiungi libro");
        JMenuItem remBook = new JMenuItem("Rimuovi libro");
        JMenuItem searchBook = new JMenuItem("Cerca libro");

        JMenuItem[] items = {nuovo, apri, salva, addBook, remBook, searchBook};
        for (JMenuItem item : items) {
            item.setBackground(mc);
            item.setForeground(Color.WHITE);
        }

        addBook.addActionListener(e -> {
            Addbook a = new Addbook();
        });

        fileMenu.add(nuovo);
        fileMenu.add(apri);
        fileMenu.add(salva);
        fileMenu.addSeparator();
        editMenu.add(addBook);
        editMenu.add(remBook);
        editMenu.add(searchBook);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setLayout(new BorderLayout());
        setBackground(mc);
        add(menuBar, BorderLayout.NORTH);
    }
}
