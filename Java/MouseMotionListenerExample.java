
import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerExample extends JFrame implements MouseMotionListener {
    MouseMotionListenerExample() {
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 20, 20);

        // throw new UnsupportedOperationException("Unimplemented method
        // 'mouseDragged'");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
