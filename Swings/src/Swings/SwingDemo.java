package Swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Display extends JFrame implements ActionListener {
    JTextField t1,t2;
    JButton b;
    JLabel l1;

    public Display(){
        // This is to Display Frame on the Screen, By Default the Frame is
        setLayout(new FlowLayout());
        // Used to allow close button work properly
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // This is to visible frame by default it is false
        setVisible(true);
        // To Set Frame Size
        setSize(300,300);
        // Set Title for Window
        setTitle("Addition of two Numbers");

        // Code for Addition
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("Add");
        l1 = new JLabel("Result");
        add(t1);
        add(t2);
        add(b);
        add(l1);

        b.addActionListener(this); // Action Listener is an Interface
    }

    public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value = num1 + num2;
        l1.setText(String.valueOf(value));
    }
}

public class SwingDemo {
    public static void main(String[] args) {
        Display obj = new Display();
    }
}
