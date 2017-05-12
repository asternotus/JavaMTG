package com.company.player;

import com.company.card.Card;
import com.company.deck.Deck;

import java.util.ArrayList;

/**
 * Created by Michael on 12.05.2017.
 */
public class Hand {
    ArrayList<Card> cards = new ArrayList<>();
    Deck playerDeck;

    public Hand(Deck playerDeck) {
        this.playerDeck = playerDeck;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void add(int number) {
        for (int i = 0; i < number; i++) {
            cards.add(playerDeck.getCardFromTop());
        }
    }
}
