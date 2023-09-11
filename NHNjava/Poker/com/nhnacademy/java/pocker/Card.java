package com.nhnacademy.java.pocker;


public class Card {
    private Suit suit;
    private String index;

    public Card(Suit suit, String index){
        this.suit = suit;
        this.index = index;
    }

    @Override
    public String toString() {
        return
                "모양 : " + suit +
                ", 숫자 : " + index + "  ";
    }

    public Suit suit(){
        return suit;
    }

    public String getIndex(){
        return index;
    }


}
