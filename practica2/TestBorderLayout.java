package practica2;
//imports
import javax.swing.*;
import java.awt.*;

public class TestBorderLayout extends JFrame {
    //Call JPanel
    JPanel container;

    //Construct
    public TestBorderLayout() {
        //Instance container
        this.container = new JPanel();
        //Setting a layout
        this.container.setLayout(new BorderLayout());

        //Adding components
        container.add(new JButton("NORTH BUTTON"), BorderLayout.NORTH);
        container.add(new JButton("SOUTH BUTTON"), BorderLayout.SOUTH);
        container.add(new JButton("CENTER BUTTON"), BorderLayout.CENTER);
        container.add(new JButton("EAST BUTTON"), BorderLayout.EAST);
        container.add(new JButton("WEST BUTTON"), BorderLayout.WEST);
        add(container);
        //Setting size
        setSize(400, 400);
        //Showing the container
        setVisible(true);

    }

    public static void main(String[] args) {
        TestBorderLayout test = new TestBorderLayout();
    }

}
