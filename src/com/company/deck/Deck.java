package com.company.deck;
import com.company.card.Card;
import com.company.fileManager.XMLManager;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by MichaelTrap on 06.04.2017.
 */
public class Deck {
    private ArrayList<Card> cards;

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    XMLManager manager= new XMLManager();

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Deck(){
        cards = new ArrayList<Card>();
    }

    public void add(String name) throws ParserConfigurationException, SAXException, IOException {
        cards.add(manager.makeCard(name));
    }

    public void remove(int index){
        cards.remove(index);
    }

    public Card getCardFromTop(){
        Card card = cards.get(0);
        remove(0);
        return card;
    }

}


