package com.company.UI;

import com.company.card.Card;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Лёва on 04.06.2017.
 */
public class CardPanel extends JPanel {
    public CardPanel(){
        super();
        setBounds(0,521,794,250);
        setLayout(null);
        setBackground(Color.WHITE);
        int x=0;
        int width = 250;
        for(int i = 0 ; i < 3;i++){
            if(i == 0 ){
                x+=22;
            }
            add(new CardLabel(x,width));
            x+=width;
        }
    }
}
