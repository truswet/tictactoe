package com.company;

/**
 * Created by u on 3/24/17.
 */
public class Game {
    GameBoard  board;
    Player playerOne;
    Player playerTwo;
    private boolean playerOneIsMoving = true;
    private boolean gameLoop = true;

    public void start ()
    {
        board = new GameBoard();
        playerOne = new HumanPlayer(board, Mark.X, new ManualGameStrategy());
        playerTwo = new ComputerPlayer(board, Mark.O, new RandomGameStrategy());

        while (gameLoop)
        {
            if (playerOneIsMoving)
            {
                if(board.hasWon(playerOne.makeMove())){
                    System.out.println("You won!");
                    break;
                }
            }
            else
            {
                if(board.hasWon(playerTwo.makeMove())){
                    System.out.println("Computer won!");
                    break;
                }
            }

            playerOneIsMoving = !playerOneIsMoving;
            gameLoop = !board.isDraw();
        }

        System.out.println("GAME OVER");
    }

    public static void main(String[] args) {
        Game g = new Game();
        System.out.println("Welcome to Tic-Tac-Toe, please key in moves like using a phone keypad: ");
        System.out.println("1|2|3");
        System.out.println("4|5|6");
        System.out.println("7|8|9");
        g.start();
    }
}
