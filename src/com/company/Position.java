package com.company;

/**
 * Created by u on 3/24/17.
 */
public enum Position {
    TOP_LEFT(1),
    TOP_CENTER(2),
    TOP_RIGHT(3),

    MIDDLE_LEFT(4),
    MIDDLE_CENTER(5),
    MIDDLE_RIGHT(6),

    BOTTOM_LEFT(7),
    BOTTOM_CENTER(8),
    BOTTOM_RIGHT(9);

    private int num;

    private Position(int i)
    {
        num = i;
    }

    public Position getNext()
    {
        int b = (num + 1) % 9;

        return Position.values()[b];
    }
}
