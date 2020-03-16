package activity2;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Activity2 {
    public static void main(String[] args) {
        //Init the application
        Frame window = new Frame();
    }
}

class Frame extends JFrame {
    public Frame() {
        this.setTitle("Activity 2 ");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setBounds(400, 200, 400, 300);

        //Set borderLayout for JFrame
        this.setLayout(new BorderLayout());

        //Create a JPanel
        Panel panel = new Panel();
        this.add(panel, BorderLayout.CENTER);

        this.setVisible(true);
        //Not resizable
        this.setResizable(false);
        //Add window listeners
        addWindowListener(new windowListener());

    }


}

class Panel extends JPanel implements KeyListener {

    public Panel() {
        //Set miscellaneous configs
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.setLayout(new GridLayout(3, 2));

        //Create components
        JTextArea eventKeys = new JTextArea();
        JButton eventMouse = new JButton("Hover me and change my background color");
        JLabel label = new JLabel("Press ESC key for exit");
        eventMouse.setBackground(new Color(187,222,251));
        eventMouse.setName("Button");
        //Add components
        this.add(eventKeys);
        this.add(eventMouse);
        this.add(label);

        //Add key listener
        eventKeys.addKeyListener(this);
        eventMouse.addMouseListener(new eventMouse());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //End the execution
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    class eventMouse implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {

            e.getComponent().setBackground(new Color(154, 226,251));

        }

        @Override
        public void mouseExited(MouseEvent e) {
            e.getComponent().setBackground(new Color(187,222,251));
        }
    }


}

class windowListener implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        Window window = e.getWindow();
        int response = JOptionPane.showConfirmDialog(null, "You will close the window, are you sure?");

        if (response == 0) {
            //Close the window
            window.dispose();

        } else if (response == 1) {
            window.setVisible(true);
            JOptionPane.showMessageDialog(null, "Welcome again :)");
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // Message when the you close the window
        JOptionPane.showMessageDialog(null, "Wait, we're closing the window...");
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}