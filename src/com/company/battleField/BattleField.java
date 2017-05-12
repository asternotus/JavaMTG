package com.company.battleField;

import com.company.card.Card;

import java.util.ArrayList;

/**
 * Created by Админ (Рулан) on 11.05.2017.
 */
public class BattleField {
    ArrayList<Card> data = new ArrayList<>();
    public Card get(String name)throws IllegalArgumentException{
        for(Card c:data){
            if (c.getCardname() == name) {
                Card temp = c;
                data.remove(c);
                return temp;
            }
        }
        throw new IllegalArgumentException();
    }
    public void addCard(Card card){
        data.add(card);
    }

    public ArrayList<Card> getData() {
        return data;
    }
}
