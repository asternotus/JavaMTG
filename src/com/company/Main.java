package com.company;

import com.company.card.Card;
import com.company.deck.Deck;
import com.company.deck.DeckController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Deck deck = new Deck("JavaMTG/src/com/company/files");

        System.out.println("Колода готова");
        System.out.println();
        

        for(int i = 0 ; i < deck.getCards().size();i++){
            System.out.println(deck.getCardFromTop().getCardname()) ;

        }

    }
}