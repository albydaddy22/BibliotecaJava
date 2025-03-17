import javax.swing.*;
import java.awt.*;

public class Addbook extends JFrame {

    private final Color mc = new Color(42, 46, 57);
    private Biblioteca b = new Biblioteca();

    public Addbook() {
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        p.setBackground(mc);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel l1 = new JLabel("Titolo: ");
        JTextField t1 = new JTextField(15);

        JLabel l2 = new JLabel("Autore: ");
        JTextField t2 = new JTextField(15);

        JLabel l3 = new JLabel("Data Pubblicazione: ");
        JTextField t3 = new JTextField(15);

        JLabel l4 = new JLabel("Editore: ");
        JTextField t4 = new JTextField(15);

        Btn addButton = new Btn("Aggiungi", mc, 16);

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);

        t1.setForeground(Color.WHITE);
        t2.setForeground(Color.WHITE);
        t3.setForeground(Color.WHITE);
        t4.setForeground(Color.WHITE);

        t1.setBackground(mc);
        t2.setBackground(mc);
        t3.setBackground(mc);
        t4.setBackground(mc);

        t1.setCaretColor(Color.WHITE);
        t2.setCaretColor(Color.WHITE);
        t3.setCaretColor(Color.WHITE);
        t4.setCaretColor(Color.WHITE);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0; gbc.gridy = 0; p.add(l1, gbc);
        gbc.gridx = 1; gbc.gridy = 0; p.add(t1, gbc);
        gbc.gridx = 0; gbc.gridy = 1; p.add(l2, gbc);
        gbc.gridx = 1; gbc.gridy = 1; p.add(t2, gbc);
        gbc.gridx = 0; gbc.gridy = 2; p.add(l3, gbc);
        gbc.gridx = 1; gbc.gridy = 2; p.add(t3, gbc);
        gbc.gridx = 0; gbc.gridy = 3; p.add(l4, gbc);
        gbc.gridx = 1; gbc.gridy = 3; p.add(t4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        p.add(addButton, gbc);

        addButton.addActionListener(e -> {
            String ti = t1.getText();
            String au = t2.getText();
            String da = t3.getText();
            String ed = t4.getText();

            b.aggiungiLibro(new Libro(ti, au, da, ed));

            Field f = new Field();

            if (ti.isEmpty() && au.isEmpty() && da.isEmpty() && ed.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Inserisci nei campi.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Libro inserito con successo1!");
                dispose();
            }
        });

        add(p);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Addbook();
    }
}
