package com.nhnacademy.java.pocker;

import java.util.ArrayList;

public class User {
    ArrayList<Card> deck = new ArrayList<Card>();

    public ArrayList<Card> getCard() {
        return deck;
    }

    void add(Card card) {
        deck.add(card);
    }

    public void setDeck(ArrayList<Card> cards){
        this.deck = cards;
    }

    public Rank countPair(){

        int countPair = 0;

      for(int i = 0; i < deck.size() - 1; i++) {
          for (int j = i + 1; j < deck.size(); j++) {

              if (deck.get(i).getIndex().equals(deck.get(j).getIndex())) {
                  countPair++;
              }
          }

      }


          if (countPair == 1) {
              return Rank.OnePair;
          } else if (countPair == 2) {
              return Rank.TwoPairs;
          } else if (countPair == 3){
              return Rank.ThreeOfKind;
          }
              return Rank.Top;
    }

    @Override
    public String toString() {
        return "User{" +
                "deck=" + deck +
                '}';
    }
}



