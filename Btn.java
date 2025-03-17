import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Btn extends JButton implements MouseListener {

    private Color originalColor;
    private final Color hoverColor = new Color(57, 61, 76);

    public Btn(String text, Color color, int fsize) {
        super(text);
        setFont(new Font("Arial Unicode MS", Font.BOLD, fsize));
        setBackground(color);
        setForeground(Color.WHITE);
        setBorderPainted(false);
        setFocusPainted(false);
        originalColor = color;

        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(hoverColor);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(originalColor);
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
}
