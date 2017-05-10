package com.company.controller;

import com.company.User.User;

import java.util.Scanner;

/**
 * Created by Michael on 10.05.2017.
 */
public class GameController {
    Scanner scan;
    User user1;
    User user2;

    public GameController() {
        scan = new Scanner(System.in);
    }

    public void start() {
         user1 = new User();
         user2 = new User();
        earlyPhase(user1);
    }


    public void earlyPhase(User user) {
        System.out.println("Ранняя фаза игрока 1");
        if (scan.nextLine().equals("Снять")) {
            user.getDeck().getCardFromTop();
        }

        if (scan.nextLine().equals("Завершить")) {
            mainPhase(user);
        }
    }

    public void mainPhase(User user) {
        System.out.println("Главная фаза игрока 1");


        if (scan.nextLine().equals("Завершить")) {
            battlePhase(user);
        }

    }

    public void battlePhase(User user) {
        System.out.println("Боя фаза игрока 1");


        if (scan.nextLine().equals("Завершить")) {
            secondMainPhase(user);
        }

    }

    public void secondMainPhase(User user) {
        System.out.println("Вторая главная фаза игрока 1");


        if (scan.nextLine().equals("Завершить")) {
            finalPhase(user);
        }

    }

    public void finalPhase(User user) {
        System.out.println("Завершающая фаза игрока 1");

        if (scan.nextLine().equals("Завершить ход")) {
            earlyPhase(user2);
        }

    }
}

