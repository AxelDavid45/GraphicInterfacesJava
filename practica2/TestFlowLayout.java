package practica2;

import javax.swing.*;
import java.awt.*;

public class TestFlowLayout extends JFrame {
    JPanel container;

    public TestFlowLayout() {
        container = new JPanel();
        container.setLayout(new FlowLayout());

        for (int i = 0; i < 5; i++) {
            container.add(new JButton("Botton" + (i + 1)));
        }
        add(container);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        TestFlowLayout test = new TestFlowLayout();

    }

}
