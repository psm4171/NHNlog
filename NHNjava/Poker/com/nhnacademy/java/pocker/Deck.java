package com.nhnacademy.java.pocker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList <Card> deck = new ArrayList<>();

    public Deck () {
        deckList();
        shuffleCard();
    }


    public ArrayList<Card> toUser(){

        ArrayList<Card> myDeck = new ArrayList<>(); // 덱 저장 공간

        for(int i = 0; i < 5; i++){
            int randomIndex = (int) (Math.random() * deck.size());
            myDeck.add(deck.get(randomIndex)); // deck.get(randomIndex)를 통해 덱의 카드 5장을 랜덤으로 myDeck에 추가
            deck.remove(randomIndex); // 전체 덱에서 myDeck에 추가한 5장을 삭제
        }

        return myDeck;
    }

    private void deckList() {
        this.deck = new ArrayList<Card>();

        Suit[] suits = {Suit.DIAMOND, Suit.CLUB, Suit.HEART, Suit.SPADE};
        String[] indexs = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


        for (int i = 0; i < indexs.length; i++) {
            for (Suit suit : suits) {
                for (String index : indexs) {
                    Card card = new Card(suit, indexs[i]);
                    this.deck.add(card);
                }

            }
        }
    }

    private void shuffleCard(){
        Collections.shuffle(deck);
    }

    public int getSize(){
        return deck.size();
    }

    }
