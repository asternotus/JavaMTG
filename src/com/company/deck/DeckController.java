package com.company.deck;

import com.company.card.Card;
import com.company.fileManager.XMLManager;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
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

    public ArrayList<Card> shuffle(){
        int m = deck.getCards().size();
        ArrayList<Card> shuffledDeck = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            Random random = new Random(m);
            int randomNum = random.nextInt(m);
            shuffledDeck.add(deck.getCards().get(randomNum));
            deck.getCards().remove(randomNum);
        }
        return shuffledDeck;
    }

}
