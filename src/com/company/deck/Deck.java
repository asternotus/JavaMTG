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

    public Deck(String path) throws ParserConfigurationException, SAXException {
        cards = new ArrayList<>();
        try {
            manager = new XMLManager();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
        try {
            add(path);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(String path) throws ParserConfigurationException, SAXException, IOException {

        File file = new File(path);

        //       System.out.println("File was created");
//        System.out.println(file.getCanonicalPath());
        if (file.isDirectory()) {

            File[] data = file.listFiles();
            for (File f : data) {
                if (f.isFile()) {
                    cards.add(manager.makeCard(f.getCanonicalPath()));

                    if (cards.get(cards.size() - 1).getCardtype().equals("Земля")) {
                        for (int i = 0; i < 19; i++) {
                            cards.add(manager.makeCard(f.getCanonicalPath()));
                        }
                    } else {
                        for (int i = 0; i < 3; i++) {
                            cards.add(manager.makeCard(f.getCanonicalPath()));
                        }
                    }
                } else {
                    System.out.println("It is not dir ");
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
