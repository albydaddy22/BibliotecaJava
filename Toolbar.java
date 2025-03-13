import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel{
    public Toolbar(){
        JButton plus = new JButton("+");
        plus.setSize(new Dimension(50,50));
        setLayout(new FlowLayout());
        add(plus);
    }
}