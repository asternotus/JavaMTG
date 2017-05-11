package com.company.player;

import com.company.battleField.BattleField;
import com.company.card.Card;
import com.company.deck.Deck;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
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
    public Player(BattleField btfld){
        cmtr= new Cemetery();
        id = new UID();
        this.btfld=btfld;
        System.out.println(id);
        try {
            deck = new Deck("src/com/company/files");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }
    public void addToCemetery(Card crd){
        cmtr.addCard(crd);
    }
    public Card getFromCementery(String name){
        return cmtr.getCard(name);
    }
    public Deck getDeck() {
        return deck;
    }
    public UID getId(){
        return id;
    }

    public int getHealth() {
        return health;
    }
    public void increaseHp(int i){health+=i;}
    public void decreaseHp(int i){health-=i;}

    public BattleField getBtfld() {
        return btfld;
    }
}
