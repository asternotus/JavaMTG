package com.company.deck;
import com.company.card.Card;
import com.company.fileManager.XMLManager;
import org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;
    private XMLManager manager;
    private int pointer = 0;

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Deck(String name) throws ParserConfigurationException, SAXException {
        cards = new ArrayList<>();
        try {
            manager = new XMLManager();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
        try {
            add(name);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(String name) throws ParserConfigurationException, SAXException, IOException {

        File file = new File(name);
//        System.out.println("File was created");
//        System.out.println(file.getCanonicalPath());
        if (file.isDirectory()) {

            File[] data = file.listFiles();
            for (File f : data) {
                if (f.isFile()) {
                    cards.add(manager.makeCard(f.getCanonicalPath()));
                }
            }
        }

    }

    public void remove() {
        pointer++;
    }

    public Card getCardFromTop() {
        Card card = cards.get(pointer);
        remove();
        return card;
    }
}
