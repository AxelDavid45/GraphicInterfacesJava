package practica2;

import javax.swing.*;
import java.awt.*;

public class TestCustomFlowLayout extends JFrame {
    JPanel container;

    public TestCustomFlowLayout() {
        container = new JPanel(new FlowLayout());
        //Adding buttons
        container.add(new JButton("Aceptar"));
        container.add(new JButton("Enviar"));
        container.add(new JButton("Conocer"));

        setTitle("Prueba");
        add(container);
        pack();
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        TestCustomFlowLayout test = new TestCustomFlowLayout();

    }
}
