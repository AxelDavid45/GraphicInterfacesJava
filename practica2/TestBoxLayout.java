package practica2;

import javax.swing.*;
import java.awt.*;

public class TestBoxLayout extends JFrame {
    JPanel container;
    public TestBoxLayout() {
        this.container = new JPanel();
        this.container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        for (int i = 0; i < 5; i++) {
            container.add(new JButton("Button"+ i ));
        }

        add(container);
        setSize(400, 400);
        setVisible(true);
    }


    public static void main(String[] args) {
        TestBoxLayout testBox = new TestBoxLayout();
    }
}

