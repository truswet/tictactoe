package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by u on 3/24/17.
 */
public class ComputerPlayer implements Player {
    GameBoard board;
    Mark mark;
    GameStrategy strategy;

    public ComputerPlayer(GameBoard board, Mark mark, GameStrategy strategy)
    {
        this.board = board;
        this.mark = mark;
        this.strategy = strategy;
    }

    @Override
    public Position makeMove()
    {
        System.out.println();
        System.out.print("Computer made this Move: ");
        Position position = strategy.generate();
        boolean set = board.mark(position, mark);
        while (!set)
        {
            position = position.getNext();
            set = board.mark(position, mark);
        }
        System.out.print(position.ordinal() + " (" + position +")");
        System.out.println();
        System.out.println(board);
        return position;
    }
}
