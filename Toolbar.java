import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {
    private final Color mc = new Color(42, 46, 57);

    public Toolbar(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        Btn plus = new Btn("＋", mc, 18);

        Btn remove = new Btn("⌫", mc, 18);

        Btn search = new Btn("\uD83D\uDD0E\uFE0E", mc, 18);

        plus.addActionListener(e -> {
            Addbook a = new Addbook();
        });

        setLayout(new FlowLayout());
        setBackground(mc);
        add(plus);
        add(remove);
        add(search);
    }
}