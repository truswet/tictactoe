package com.company;

/**
 * Created by u on 3/24/17.
 */
public enum Mark {
    X,O,BLANK;

    @Override
    public String toString() {
        switch(this) {
            case X: return "X";
            case O: return "O";
            case BLANK: return " ";
            default: throw new IllegalArgumentException();
        }
    }}
