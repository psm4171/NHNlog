package com.nhnacademy.java.pocker;
public class Card {
    private Card cards;
    private String num;
    private String shape;

    public Card(String num, String shape){
        this.num = num;
        this.shape = shape;
    }

    public String getNum(){
        return this.num;
    }

    public String getShape(){
        return this.shape;
    }

}
