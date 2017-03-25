package com.company;

import static com.company.Mark.BLANK;

/**
 * Created by u on 3/24/17.
 */
public class Tile {
    private Mark mark = BLANK;

    public Tile ()
    {
        mark = BLANK;
    }

    public Mark getMark()
    {
        return mark;
    }

    public boolean isBlank()
    {
        return mark == BLANK;
    }

    public boolean mark(Mark mark)
    {
        if (isBlank())
        {
            this.mark = mark;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof Tile && mark == ((Tile) obj).getMark();
    }

    @Override
    public String toString ()
    {
        return mark.toString();
    }}
