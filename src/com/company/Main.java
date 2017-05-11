package com.company;


import com.company.controller.GameController;
import com.company.deck.Deck;
import com.company.deck.DeckController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        GameController gameController = new GameController();
        gameController.start();

    }
}
