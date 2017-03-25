package com.company;

import java.util.Random;

/**
 * Created by u on 3/24/17.
 */
public class RandomGameStrategy implements GameStrategy {
    @Override
    public Position generate() {

        Position position = Position.values()[new Random().nextInt(Position.values().length -1 )];

        return position;
    }
}
