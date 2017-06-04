package com.company.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Лёва on 04.06.2017.
 */
public class MainPanel extends JPanel {
    public MainPanel(CardPanel panel){
        super();
        setBounds(0,0,794,771);
        setLayout(null);
        setBackground(Color.BLACK);
        add(panel);
    }

}
