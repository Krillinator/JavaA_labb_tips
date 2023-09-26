package com.kristoffer.labbtips;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* TODO - Multiple Dice
        *   Dynamic & DRY code
        *   Nested For-loop
        * */

        Scanner sc = new Scanner(System.in);

        int rounds = 5;

        System.out.println("How many dice?");
        int dice = sc.nextInt();
        System.out.println("You picked: " + dice);

        // Rounds
        for (int i = 0; i < rounds; i++) {
            System.out.println("Round: " + i);

            // Iterate Dice
            for (int j = 0; j < dice; j++) {
                Random random = new Random();

                int score = random.nextInt(6) + 1;
                System.out.println("Throwing Die " + score);
            }

        }



    }
}