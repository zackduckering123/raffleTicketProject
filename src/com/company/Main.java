package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int replay = 2;
        while (replay == 2) {

        }
    }

    public static int buyOrCheck() {
        boolean openWhile = true;
        int replay = 0;
        try {
            while (openWhile != true) {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Would you like to buy or check a ticket");
                String reply = input.readLine();
                switch (reply) {
                    case "buy":
                        System.out.println("Please enter how many tickets you want");
                        int ticketAmount = Integer.parseInt(input.readLine());

                    case "check":
                        
                }
            }
        } catch (Exception e) {
            System.out.println("This is not an option");
            openWhile = true;
        }
        return replay = 2;

    }

    public static HashMap<String, Integer> ticketStorage() {

    }
}
