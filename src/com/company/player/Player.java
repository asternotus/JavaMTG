package com.company.player;

import com.company.battleField.BattleField;
import com.company.card.Card;
import com.company.deck.Deck;
import com.company.deck.DeckController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.rmi.server.UID;

/**
 * Created by Michael on 10.05.2017.
 */
public class Player {
    private UID id;
    private Deck deck;
    private Cemetery cmtr;
    private int health=20;
    private BattleField btfld;
    private Hand hand;
    private DeckController controller;     //не уверен, что так можно.


    public Player(){
        cmtr= new Cemetery();
        id = new UID();
        btfld=new BattleField();

        System.out.println(id);
        try {
            deck = new Deck("D:\\Projects\\GitHub\\JavaMTG\\src\\com\\company\\files");
            controller = new DeckController(deck);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();} catch (IOException e) {
            e.printStackTrace();
        }
        hand = new Hand(deck.getCards());

    }

    public Deck getDeck() {
        return deck;
    }
    public UID getId(){
        return id;
    }
    public Hand getHand() {
        return hand;
    }
    public DeckController getController() {
        return controller;
    }
    public int getHealth() {
        return health;
    }
    public BattleField getBtfld() {
        return btfld;
    }



    public void addToCemetery(Card crd){
        cmtr.addCard(crd);
    }
    public Card getFromCementery(String name){
        return cmtr.getCard(name);
    }

    public void increaseHp(int i){health+=i;}
    public void decreaseHp(int i){health-=i;}


}
