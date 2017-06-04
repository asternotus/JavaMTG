package com.company.UI;

import javax.swing.*;

/**
 * Created by Лёва on 04.06.2017.
 */
public class JavaMTGUI extends JFrame {
    private MainPanel panel;
    public JavaMTGUI(){
        super("MTG");
        setSize(800,800);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        CardPanel cardPanel = new CardPanel();
        panel = new MainPanel(cardPanel);
        add(panel);
        setVisible(true);
    }

}
