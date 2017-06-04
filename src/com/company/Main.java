package com.company;


import com.company.UI.JavaMTGUI;
import com.company.controller.GameController;
import com.company.deck.Deck;
import com.company.deck.DeckController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        JavaMTGUI frame = new JavaMTGUI();
        Scanner scan = new Scanner(System.in);

        System.out.println("Приветствую тебя, мироходец, ты готов начать сражение?");
        if(scan.nextLine().equals("да")){
            GameController gameController = new GameController(scan);
            gameController.start();
        }else{
            System.out.println("Зачем запускал тогда?");
        }



    }
}
