package com.jegiraldp.player;

public class Player {

    private Dice dice;
    private int miNumber;

    public boolean play(){
        int diceNumber=dice.roll();
        return diceNumber>miNumber;
        }

    public Player(Dice dice, int miNumber) {
        this.dice = dice;
        this.miNumber = miNumber;
    }
}
