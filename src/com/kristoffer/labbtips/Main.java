package com.kristoffer.labbtips;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Amount of Players
        // Amount of Rounds
        // Amount of Dice

        // Instantiate
        Scanner sc = new Scanner(System.in);

        // Variables
        ArrayList<Player> playerList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            // Create UNIQUE players
            Player player = new Player();
            player.name = "Player" + i;
            System.out.println(player.name);

            playerList.add(player);
        }

        System.out.println("Fetching each player name!");

        for (int i = 0; i < playerList.size(); i++) {

            System.out.println(playerList.get(i).name);
        }

    }
}