package actividad1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Activity1 {
    public static void main(String[] args) {
        Window activity = new Window();
    }
}

class Window extends JFrame {
    public Window () {
        this.setTitle("Activity 1 ");

        this.setSize(340, 250);

        //Set borderLayout for JFrame
        this.setLayout(new BorderLayout());

        Layout panel = new Layout();
        this.add(panel, BorderLayout.CENTER);

        this.setVisible(true);
        //Not resizable
        this.setResizable(false);
        //Close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


class Layout extends JPanel {
    //Components
    JButton button = new JButton("I'm a button");
    JLabel label = new JLabel("Times you've clicked the button: 0");
    //Click watcher
    int clickTimes;

    public Layout() {
        //Grid layout with 2 rows and 1 column
        this.setLayout(new GridLayout(2, 1));
        // BorderEmpty property
        this.setBorder(new EmptyBorder(30, 30, 10, 30));
        // Add the button
        this.add(button);
        //Alignment for text
        label.setHorizontalAlignment(JLabel.CENTER);
        //Add label
        this.add(label);
        //Button event
        button.addActionListener(new Label());
    }

    private class Label implements ActionListener {
        public Label() {
            clickTimes++;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Times you've clicked the button: " + clickTimes++);
            //Alignment for text
            label.setHorizontalAlignment(JLabel.CENTER);
        }
    }
}

