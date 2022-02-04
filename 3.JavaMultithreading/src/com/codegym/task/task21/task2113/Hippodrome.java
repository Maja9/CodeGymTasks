package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.horses.add(new Horse("Black", 3, 0));
        game.horses.add(new Horse("White", 3, 0));
        game.horses.add(new Horse("Grey", 3, 0));
        game.run();
        game.printWinner();
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Horse getWinner() {
        Horse winner = null;
        double distance = 0;
        for (Horse horse : horses) {
            if (horse.getDistance() >= distance) {
                winner = horse;
                distance = horse.getDistance();
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("The winner is " + getWinner().getName() + "!");
    }
}
