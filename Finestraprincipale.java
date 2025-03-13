import javax.swing.*;
import java.awt.*;
public class Finestraprincipale extends JFrame{

    private Navbar n = new Navbar();
    private Toolbar t = new Toolbar();
    
    public Finestraprincipale(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width - 250,screenSize.height - 150);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel cont = new JPanel();
        
        JPanel nb = new JPanel();
        JPanel tb = new JPanel();
        
        add(cont, BorderLayout.NORTH);
        cont.setLayout(new BorderLayout());
        
        
        nb.setBackground(Color.YELLOW);
        cont.add(nb, BorderLayout.NORTH);
        nb.setLayout(new BorderLayout());
        nb.add(n, BorderLayout.WEST);
        
        cont.add(tb, BorderLayout.SOUTH);
        tb.setLayout(new BorderLayout());
        tb.add(t,BorderLayout.WEST);
        tb.setBackground(Color.BLACK);
        setVisible(true);
    }

    public static void main(String args[]){
        new Finestraprincipale();
    }
}