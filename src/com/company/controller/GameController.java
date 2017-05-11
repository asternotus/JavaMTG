package com.company.controller;

import com.company.battleField.BattleField;
import com.company.player.Player;

import java.util.Scanner;

/**
 * Created by Michael on 10.05.2017.
 */
public class GameController {
    Scanner scan;
    Player player1;
    Player player2;

    public GameController() {
        scan = new Scanner(System.in);
    }

    public void start() {
        BattleField bf = new BattleField();
        player1 = new Player(bf);
        player2 = new Player(bf);
        earlyPhase(player1);
    }


    public void earlyPhase(Player player) {
        System.out.println("Ранняя фаза игрока ");
        String temp = scan.nextLine();
        if (temp.equals("Снять")) {
            System.out.println(player.getDeck().getCardFromTop().getCardname());
        }

        if (temp.equals("Завершить")) {
            mainPhase(player);
        }
    }

    public void mainPhase(Player player) {
        System.out.println("Главная фаза игрока ");


        if (scan.nextLine().equals("Завершить")) {
            battlePhase(player);
        }

    }

    public void battlePhase(Player player) {
        System.out.println("Боя фаза игрока ");


        if (scan.nextLine().equals("Завершить")) {
            secondMainPhase(player);
        }

    }

    public void secondMainPhase(Player player) {
        System.out.println("Вторая главная фаза игрока ");


        if (scan.nextLine().equals("Завершить")) {
            finalPhase(player);
        }

    }

    public void finalPhase(Player player) {
        System.out.println("Завершающая фаза игрока ");

        if (scan.nextLine().equals("Завершить ход")) {
            if(player.getId()==player1.getId()){
                earlyPhase(player2);
            }else{
                earlyPhase(player1);
            }

        }

    }
}

