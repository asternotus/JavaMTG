package com.company.deck;

import com.company.card.Card;
import com.company.fileManager.XMLManager;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Random;

/**
 * Created by MichaelTrap on 06.04.2017.
 */
public class DeckController {

    private XMLManager manager;
    private Deck deck;

    public DeckController(Deck deck) throws ParserConfigurationException, SAXException, IOException {
        manager = new XMLManager();
        this.deck = deck;
    }

    public void shuffle() {                     //сделал это метод void
        Collections.shuffle(deck.getCards());
    }

    public void cardPresent(int numOfCards, ArrayList<Card> cards) {
        for (int i = 0; i < numOfCards; i++) {
            Card card = cards.get(0);
            cards.remove(0);
            System.out.println(card.getCardname());
        }

    }
}

