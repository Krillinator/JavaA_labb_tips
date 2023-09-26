package com.kristoffer.labbtips;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiate
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Variables
        String player1;
        String player2;
        int die;            // TODO - Number of Dice
        int rounds = 5;
        int player1Sum = 0;
        int player2Sum = 0;

        // Player1 - name
        System.out.println("Input player1's name!");
        player1 = sc.nextLine();
        System.out.println("Player1's name is: " + player1);

        // Player2 - name
        System.out.println("Input player2's name!");
        player2 = sc.nextLine();
        System.out.println("Player2's name is: " + player2);

        // // // // // //
        // Game Logic //
        // // // // //

        /* TODO - Each Round?
         *  Each Player -> ThrowDice()
         * */

        // Player1 turn
        System.out.println(player1 + " is throwing!");

        for (int i = 0; i < rounds; i++) {

            // Dice
            die = random.nextInt(6) + 1;
            System.out.println(die); // Throw Dice

            player1Sum += die;
            System.out.println("Sum is: " + player1Sum);
        }

        // Player2 turn
        System.out.println(player2 + " Is throwing!");

        for (int i = 0; i < rounds; i++) {

            // Dice
            die = random.nextInt(6) + 1;
            System.out.println(die); // Throw Dice

            player2Sum += die;
            System.out.println("Sum is: " + player2Sum);
        }

        // TODO - Who won?
        System.out.println(player1 + " score: " + player1Sum);
        System.out.println(player2 + " score: " + player2Sum);


    }
}
