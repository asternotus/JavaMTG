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
        //Deck deck = new Deck("D:\\Projects\\GitHub\\JavaMTG\\src\\com\\company\\files");


       System.out.println("Колода готова");
        //System.out.println();

        //DeckController controller = new DeckController(deck);
        //controller.shuffle();


        //for (int i = 0; i < deck.getCards().size(); i++) {
        //    System.out.println(deck.getCardFromTop().getCardname());

       // }

    }
}
