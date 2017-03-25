package com.company;

import java.util.Scanner;

/**
 * Created by u on 3/25/17.
 */
public class ManualGameStrategy implements GameStrategy {

    @Override
    public Position generate() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while(input<1 || input>9){
            System.out.println("Invailid selection, please enter a number between 1 and 9:");
            input = scan.nextInt();
        }
        return Position.values()[input-1];
    }
}
