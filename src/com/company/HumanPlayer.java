package com.company;

import java.util.Scanner;

/**
 * Created by u on 3/25/17.
 */
public class HumanPlayer implements Player {
    GameBoard board;
    Mark mark;
    GameStrategy strategy;

    public HumanPlayer(GameBoard board, Mark mark, GameStrategy strategy)
    {
        this.board = board;
        this.mark = mark;
        this.strategy = strategy;
    }

    @Override
    public Position makeMove()
    {
        boolean marked = false;
        Position position = null;
        while (!marked)
        {
            System.out.println();
            System.out.print("Enter you move (1-9): ");
            System.out.println();
            position = strategy.generate();
            marked = board.mark(position, mark);
        }
        System.out.print(" You made this Move: " + (position.ordinal()+1) + " (" + position +")");
        System.out.println();
        System.out.println(board);

        return position;
    }
}
