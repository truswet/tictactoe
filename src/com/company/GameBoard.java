package com.company;

/**
 * Created by u on 3/24/17.
 */
public class GameBoard {

    public static final int ROWS = 3;
    public static final int COLS = 3;

    Tile[][] tiles;

    public GameBoard ()
    {
        tiles = new Tile[ROWS][COLS];
        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                tiles[row][col] = new Tile();
            }
        }
    }

    public boolean isDraw() {
        for (Tile[] row : tiles) {
            for (Tile t: row) {
                if (t.isBlank()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hasWon(Position p){
        switch (p)
        {
            case TOP_LEFT:
                return (tiles[0][0].equals(tiles[0][1]) && tiles[0][1].equals(tiles[0][2]))
                        ||(tiles[0][0].equals(tiles[1][0]) && tiles[1][0].equals(tiles[2][0]))
                        ||(tiles[0][0].equals(tiles[1][1]) && tiles[1][1].equals(tiles[2][2]));
            case TOP_CENTER:
                return (tiles[0][1].equals(tiles[0][0]) && tiles[0][1].equals(tiles[0][2]))
                        ||(tiles[0][1].equals(tiles[1][1]) && tiles[1][1].equals(tiles[2][1]));
            case TOP_RIGHT:
                return (tiles[0][2].equals(tiles[0][1]) && tiles[0][1].equals(tiles[0][0]))
                        ||(tiles[0][2].equals(tiles[1][2]) && tiles[1][2].equals(tiles[2][2]))
                        ||(tiles[0][2].equals(tiles[1][1]) && tiles[1][1].equals(tiles[2][0]));
            case MIDDLE_LEFT:
                return (tiles[1][0].equals(tiles[0][0]) && tiles[1][0].equals(tiles[2][0]))
                        ||(tiles[1][0].equals(tiles[1][1]) && tiles[1][1].equals(tiles[1][2]));
            case MIDDLE_CENTER:
                return (tiles[1][1].equals(tiles[0][1]) && tiles[1][1].equals(tiles[2][1]))
                        ||(tiles[1][1].equals(tiles[1][0]) && tiles[1][1].equals(tiles[1][2]))
                        ||(tiles[1][1].equals(tiles[0][0]) && tiles[1][1].equals(tiles[2][2]))
                        ||(tiles[1][1].equals(tiles[0][2]) && tiles[1][1].equals(tiles[2][0]));
            case MIDDLE_RIGHT:
                return (tiles[1][2].equals(tiles[1][1]) && tiles[1][1].equals(tiles[1][0]))
                        ||(tiles[1][2].equals(tiles[0][2]) && tiles[1][2].equals(tiles[2][2]));
            case BOTTOM_LEFT:
                return (tiles[2][0].equals(tiles[1][0]) && tiles[1][0].equals(tiles[0][0]))
                        ||(tiles[2][0].equals(tiles[2][1]) && tiles[2][1].equals(tiles[2][2]))
                        ||(tiles[2][0].equals(tiles[1][1]) && tiles[1][1].equals(tiles[0][2]));
            case BOTTOM_CENTER:
                return (tiles[2][1].equals(tiles[1][1]) && tiles[1][1].equals(tiles[0][1]))
                        ||(tiles[2][1].equals(tiles[2][0]) && tiles[2][1].equals(tiles[2][2]));
            case BOTTOM_RIGHT:
                return (tiles[2][2].equals(tiles[2][1]) && tiles[2][1].equals(tiles[2][0]))
                        ||(tiles[2][2].equals(tiles[1][2]) && tiles[1][2].equals(tiles[0][2]))
                        ||(tiles[2][2].equals(tiles[1][1]) && tiles[1][1].equals(tiles[0][0]));
            default:
                return false;
        }

    }

    public boolean mark (Position position, Mark mark)
    {
        switch (position)
        {
            case TOP_LEFT:
                return tiles[0][0].mark(mark);
            case TOP_CENTER:
                return tiles[0][1].mark(mark);
            case TOP_RIGHT:
                return tiles[0][2].mark(mark);
            case MIDDLE_LEFT:
                return tiles[1][0].mark(mark);
            case MIDDLE_CENTER:
                return tiles[1][1].mark(mark);
            case MIDDLE_RIGHT:
                return tiles[1][2].mark(mark);
            case BOTTOM_LEFT:
                return tiles[2][0].mark(mark);
            case BOTTOM_CENTER:
                return tiles[2][1].mark(mark);
            case BOTTOM_RIGHT:
                return tiles[2][2].mark(mark);
            default:
                return false;
        }
    }

    @Override
    public String toString ()
    {
        String out = "";

        for (int row = 0; row < ROWS; ++row) {
            for (int col = 0; col < COLS; ++col) {
                String tile = tiles[row][col].toString();
                if (col == 1) tile = "|" + tile + "|";
                out += tile;
            }
            out+="\n";
        }

        return out;
    }
}
