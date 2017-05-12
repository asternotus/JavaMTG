package com.company.player;

import com.company.card.Card;

import java.util.ArrayList;


public class Cemetery {
     ArrayList<Card> data = new ArrayList<>();
     public Cemetery(){}
     public void addCard(Card card){
         data.add(card);
     }

     public Card getCard(String name) throws IllegalArgumentException{
         for(Card card:data)
             if(card.getCardname()==name){
                 Card temp = card;
                 data.remove(card);
                 return temp;
             }

         throw new IllegalArgumentException();
     }


}
