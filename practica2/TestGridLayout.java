package practica2;

import javax.swing.*;
import java.awt.*;

public class TestGridLayout extends JFrame {
    JPanel container;

    public TestGridLayout() {
        container = new JPanel();
        container.setLayout(new GridLayout(4,4));

        for (int i = 0; i < 16; i++) {
            container.add(new JButton("Botton" + (i + 1)));
        }
        add(container);
        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        TestGridLayout test = new TestGridLayout();
        //Finish the execution
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
