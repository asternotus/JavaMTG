package com.company.controller;


import com.company.card.Card;
import com.company.player.Player;

import java.util.Scanner;

/**
 * Created by Michael on 10.05.2017.
 */
public class GameController {
    Scanner scan;
    Player player1;
    Player player2;


    public GameController(Scanner scan) {
        this.scan = scan;
    }

    public void start() {
        player1 = new Player();
        player2 = new Player();
        prepairings(player1);
    }

    public void prepairings(Player player) {

        player.getController().shuffle();
        System.out.println("Ваша колода");
        player.getController().cardPresent(player.getDeck().getCards().size(), player.getDeck().getCards());
        System.out.println();
        System.out.println("Вы хотите взять карты?");

        if (scan.nextLine().equals("да")) {
            player.getHand().add(7);
            player.getController().cardPresent(7, player.getHand().getCards());
            System.out.println();
        } else spinStep(player);

        System.out.println("Вам нравится ваш замес?");

        if (scan.nextLine().equals("нет")) {
            player.getHand().add(6);
            player.getController().cardPresent(6, player.getHand().getCards());
            System.out.println("хороший замес. играть я им, конечно, не буду");
            spinStep(player);
        } else spinStep(player);

    }

    public void spinStep(Player player) {
        System.out.println("Ранняя фаза игрока ");
        for (Card card : player.getBtfld().getData()) {
            card.setSpin(false);
            System.out.println("Карты повернуты");
        }
        System.out.println("Что вы хотите сделать? Снять или завершить ход?");

        if (scan.nextLine().equals("Снять")) {
            player.getHand().add(1);
            player.getController().cardPresent(1, player.getDeck().getCards());
        } else if (scan.nextLine().equals("Завершить")) {
            supportStep(player);
        }

    }

    public void supportStep(Player player) {
        System.out.println("Шаг поддержки. Завершить?");
        if (scan.nextLine().equals("Завершить")) {
            getCardStep(player);
        }
    }

    public void getCardStep(Player player) {
        player1.getHand().add(1);
        System.out.println("Показать вашу руку?");
        if (scan.nextLine().equals("да")) {
            player1.getController().cardPresent(player1.getHand().getCards().size(), player1.getHand().getCards());  // пиздос, как меня смущает эта строка
        } else mainPhase(player1);
    }

    public void mainPhase(Player player) {
        System.out.println("Главная фаза игрока. Завершить?");

        if (scan.nextLine().equals("Завершить")) {
            battlePhase(player);
        }

    }

    public void battlePhase(Player player) {
        System.out.println("Фаза боя.Завершить?");


        if (scan.nextLine().equals("Завершить")) {
            secondMainPhase(player);
        }

    }

    public void secondMainPhase(Player player) {
        System.out.println("Вторая главная фаза игрока. Завершить?");

        if (scan.nextLine().equals("Завершить")) {
            finalPhase(player);
        }

    }

    public void finalPhase(Player player) {
        System.out.println("Завершающая фаза игрока ");

        if (scan.nextLine().equals("Завершить ход")) {
            if (player.getId() == player1.getId()) {
                prepairings(player2);
            } else {
                prepairings(player1);
            }

        }

    }
}

