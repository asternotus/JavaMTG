package com.company.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Лёва on 04.06.2017.
 */
public class CardLabel extends JLabel {
    public CardLabel(int x,int width){
        super();
        setBounds(x,0,width,250);
        setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
    }

}
