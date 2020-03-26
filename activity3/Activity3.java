package activity3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Activity3 {
    public static void main(String[] args) {
        Frame activity = new Frame();
        activity.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Frame extends JFrame {
    public Frame() {
        this.setLayout(new BorderLayout());
        this.setTitle("Activity 3");
        this.setBounds(400, 200, 400, 300);
        Panel panel = new Panel();
        this.add(panel, BorderLayout.CENTER);


        this.setVisible(true);
    }
}

class Panel extends JPanel {
    JButton button;
    public Panel() {
        this.setBorder(new EmptyBorder(20, 10, 20, 10));

        //Set the layout
        this.setLayout(new GridBagLayout());
        //GridBagLayout constraints needed for place elements
        GridBagConstraints constants = new GridBagConstraints();
        //Create the button
        this.button = new JButton("Button");
        //Button font type and font size
        this.button.setFont(new Font("Tahoma", Font.PLAIN, 12));
        //Button font color
        this.button.setForeground(new Color(33,33,33));
        //Button Background
        this.button.setBackground(new Color(205,220,57));
        //Create GridBagConstants values for this button
        constants.fill = GridBagConstraints.HORIZONTAL;
        constants.ipady = 40;      //make this component tall
        constants.weightx = 3.0;
        constants.gridwidth = 3;
        constants.gridx = 0;
        constants.gridy = 1;
        this.add(this.button, constants);

    }
}
