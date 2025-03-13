import javax.swing.*;
import java.awt.*;
public class Navbar extends JPanel{
    public Navbar(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem nuovo = new JMenuItem("New");
        JMenuItem apri = new JMenuItem("Open");
        JMenuItem salva = new JMenuItem("Save");
        JMenuItem esci = new JMenuItem("Exit");

        fileMenu.add(nuovo);
        fileMenu.add(apri);
        fileMenu.add(salva);
        fileMenu.addSeparator();
        fileMenu.add(esci);

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        JMenuItem aboutItem = new JMenuItem("About");
        
        helpMenu.add(aboutItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setBackground(Color.YELLOW);
        add(menuBar);
    }
}
