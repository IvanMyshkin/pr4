package ru.mirea;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame{

    JPanel panel = new JPanel();
    JButton button1 = new JButton("lA lakers");
    JButton button2 = new JButton("chicago bulls");
    int i = 0;
    int t = 0;
    JLabel label1 = new JLabel("Result: " + i +" "+ "X" +" "+ t);
    JLabel label2 = new JLabel("Last Scorer: ");
    JLabel label3 = new JLabel("Winner: ");

    public GUI(int a, int b) {
        super("Простое графическое окно");
        setSize(a, b);
        setVisible(true);

        add(panel);
        panel.setLayout(new GridLayout(3,3));
        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i+=1;
                label1.setText("Result: " + i +" "+ "X" +" "+ t);
                label2.setText("Last Scorer: lA lakers");
                if(i < t) label3.setText("Winner: chicago bulls");
                else if(i > t) label3.setText("Winner: lA lakers");
                else label3.setText("Winner: ");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t+=1;
                label1.setText("Result: " + i +" "+ "X" +" "+ t);
                label2.setText("Last Scorer: chicago bulls");
                if(i < t) label3.setText("Winner: chicago bulls");
                else if(i > t) label3.setText("Winner: lA lakers");
                else label3.setText("Winner: ");
            }
        });

    }
}