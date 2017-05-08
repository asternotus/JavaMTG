package com.company;


import com.company.deck.Deck;
import com.company.deck.DeckController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        for(int i=0;i<5; i++){
           deck.add(scanner.nextLine());
        }

        DeckController deckController = new DeckController(deck);

        System.out.println("Колода готова");

        deckController.shuffle(deck);

        deckController.cardPresent(1,deck);
        }
        //Rfr ds;bnm d >;yjErhfbycrt&
    }
